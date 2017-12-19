/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月18日
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
import java.util.concurrent.TimeUnit;

/**
 * @Type Interrupt.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月18日 下午1:39:43
 * @version 
 */
public class Interrupt implements Runnable {

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                TimeUnit.SECONDS.sleep(1);

                System.out.println("waiting interupt");
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Exist interupt");
        } finally {
            System.out.println("finally run");
        }
        //        synchronized (this) {
        //            try {
        //                if (!Thread.interrupted()) {
        //                    System.out.println("Thread not interrupted1");
        //                }
        //                wait();
        //            } catch (InterruptedException e) {
        //
        //                e.printStackTrace();
        //            }
        //        }
        //        if (Thread.interrupted()) {
        //            System.out.println("Thread  interrupted");
        //        }
        //        if (!Thread.interrupted()) {
        //            System.out.println("Thread not interrupted2");
        //        } else {
        //            System.out.println("not interrupted");
        //        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Interrupt interrupt = new Interrupt();
        executorService.execute(interrupt);
        TimeUnit.SECONDS.sleep(3);
        //        synchronized (interrupt) {
        //            interrupt.notifyAll();
        //        }
        executorService.shutdownNow();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月18日 zhuwuming creat
 */
