/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年9月8日
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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Type ConcurrencyTest.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年9月8日 下午7:50:01
 * @version 
 */
public class ConcurrencyTest {
    static ConcurrencyTest ct = new ConcurrencyTest();

    static Task getIns(int n) {
        return ct.new Task(n);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(getIns(2));
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    class Task implements Callable<String> {
        int n;

        public Task(int n) {
            this.n = n;
        }

        @Override
        public String call() throws Exception {
            // TODO Auto-generated method stub
            return "第" + n + "任务开始了";
        }

    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年9月8日 zhuwuming creat
 */
