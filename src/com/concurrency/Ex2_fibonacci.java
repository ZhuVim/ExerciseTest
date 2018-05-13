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

import java.util.Arrays;

/**
 * @Type Ex2_fibonacci.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月21日 下午2:53:56
 * @version 
 */
public class Ex2_fibonacci implements Runnable {

    private int count = 0;

    public Ex2_fibonacci(int count) {

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
    public void run() {

        System.out.println(Arrays.toString(next()) + '\n');
    }

    public static void main(String[] args) {
        for (int i = 3; i < 7; i++) {
            new Thread(new Ex2_fibonacci(i)).start();
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
