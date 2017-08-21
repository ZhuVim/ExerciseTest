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

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Type Ex5_callable.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月21日 下午5:06:51
 * @version 
 */
public class Ex5_callable implements Callable<String> {
    private int count = 0;

    public Ex5_callable(int count) {

        this.count = count;
    }

    public int[] next() {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = frib(i);
        }
        return array;
    }

    private int frib(int n) {
        if (n <= 1)
            return 1;
        else
            return frib(n - 1) + frib(n - 2);
    }

    @Override
    public String call() throws Exception {
        // TODO Auto-generated method stub
        Integer integer = 0;
        for (int ay : next()) {
            integer = +ay;
        }
        return integer.toString();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> resultsArrayList = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            resultsArrayList.add(executorService.submit(new Ex5_callable(i)));
        }
        for (Future<String> fs : resultsArrayList) {
            System.out.println(fs.get());
        }
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
