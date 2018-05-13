/*
 * Project: Test
 * 
 * File Created at 2017年5月27日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.generics;

/**
 * @Type ThreadTest.java
 * @Desc 
 * @author Wuming
 * @date 2017年5月27日 下午5:05:24
 * @version 
 */
public class ThreadTest extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " running");

    }

    public static void main(String[] args) {
        {
            // TODO Auto-generated method stub
            Thread myThread = new ThreadTest();
            myThread.start();

            Thread myThread1 = new ThreadTest();
            myThread1.start();

        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年5月27日 Wuming creat
 */
