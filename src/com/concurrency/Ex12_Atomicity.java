/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月11日
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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Type Ex12_Atomicity.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月11日 下午5:32:32
 * @version 
 */
public class Ex12_Atomicity implements Runnable {
    private int i = 0;

    public synchronized int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Ex12_Atomicity atomicity = new Ex12_Atomicity();
        executorService.execute(atomicity);
        while (true) {
            int val = atomicity.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月11日 zhuwuming creat
 */
