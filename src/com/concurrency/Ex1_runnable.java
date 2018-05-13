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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Type Ex1_runnable.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月21日 下午2:22:26
 * @version 
 */
public class Ex1_runnable implements Runnable {
    private static int taskCount;
    private final int id = taskCount++;

    public Ex1_runnable() {
        System.out.println("begin,ID= " + id);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("start run" + (i + 1) + " ID= " + id);
            Thread.yield();
        }
        System.out.println("end,ID= " + id);
        return;
    }

    public static void main(String[] args) {
        //        for (int i = 0; i < 5; i++) {
        //            new Thread(new Ex1_runnable()).start();
        //        }
        //        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executor.execute(new Ex1_runnable());
        }
        executor.shutdown();
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
