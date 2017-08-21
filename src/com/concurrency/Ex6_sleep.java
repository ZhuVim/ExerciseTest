/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年8月21日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Type Ex6_sleep.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月21日 下午6:50:20
 * @version 
 */
public class Ex6_sleep implements Runnable {
    Random random = new Random();

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int time = random.nextInt(9000) + 1000;
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("睡眠时间是= " + time);
        return;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Ex6_sleep());

        }
        executorService.shutdown();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年8月21日 zhuwuming creat
 */
