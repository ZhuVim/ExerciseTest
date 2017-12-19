/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月15日
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

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Type Ex15_Critical.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月15日 上午10:06:06
 * @version 
 */
public class Ex15_Critical {
    private Object synchObject = new Object();
    private Lock lock = new ReentrantLock();
    final static int num = 20;

    public void f() {
        lock.lock();
        try {
            for (int i = 0; i < num; i++) {
                System.out.println("f()");
            }
        } finally {
            lock.unlock();
        }
    }

    public void g() {
        lock.lock();
        try {
            for (int i = 0; i < num; i++) {
                System.out.println("g()");
            }
        } finally {
            lock.unlock();
        }
    }

    public void k() {
        synchronized (synchObject) {
            for (int i = 0; i < num; i++) {
                System.out.println("k()");
                Thread.yield();
            }
        }
    }

    public synchronized void x() {
        for (int i = 0; i < num; i++) {
            System.out.println("x()");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        final Ex15_Critical critical = new Ex15_Critical();
        new Thread() {
            public void run() {
                critical.k();
            }
        }.start();
        critical.x();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月15日 zhuwuming creat
 */
