/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年10月9日
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
 * @Type Ex11_UnCertainState.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年10月9日 上午11:27:14
 * @version 
 */
public class Ex11_UnCertainState implements Runnable {
    static int filed1 = 0;
    static int filed2 = 0;

    public synchronized void changeFiled() {

        System.out.println("filed1 result= " + filed1);
        filed1++;

        System.out.println("filed2 result= " + filed2);
        filed2++;

    }

    public int readField1() {
        return filed1;
    }

    public int readField2() {
        return filed2;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        int count = 10;
        for (int i = 0; i < count; i++) {
            exec.execute(new Ex11_UnCertainState());
        }
        exec.shutdown();

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        changeFiled();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年10月9日 zhuwuming creat
 */
