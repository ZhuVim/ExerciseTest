/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年9月21日
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
 * @Type EvenChecker.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年9月21日 下午4:52:21
 * @version 
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("press control + C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i));
            exec.shutdown();
        }
    }

    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年9月21日 zhuwuming creat
 */
