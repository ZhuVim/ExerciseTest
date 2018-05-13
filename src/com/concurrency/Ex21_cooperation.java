/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月17日
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
 * @Type Ex21_cooperation.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月17日 下午10:49:07
 * @version 
 */
public class Ex21_cooperation {
    public static void main(String[] args) {
        Runnable run1 = new Run1();
        Runnable run2 = new Run2(run1);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(run1);
        ex.execute(run2);
        ex.shutdown();
    }
}

class Run1 implements Runnable {
    static boolean flag = false;

    public void run() {

        try {
            synchronized (this) {
                wait();
                System.out.println("start Run1");
            }
            System.out.println("Task complete");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Run2 implements Runnable {
    Runnable run1;

    public Run2(Runnable run12) {
        // TODO Auto-generated constructor stub
        this.run1 = (Run1) run12;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("start Run2");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        synchronized (run1) {
            run1.notifyAll();

        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月17日 zhuwuming creat
 */
