/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年8月22日
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

import java.util.concurrent.TimeUnit;

import com.until.Print;

/**
 * @Type Daemon2.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月22日 下午2:38:08
 * @version 
 */
public class Daemon2 implements Runnable {
    private Thread[] t = new Thread[10];

    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            Print.printnb("DaemonSpawn " + i + " started, ");
        }
        try {
            // To better see the effect of altering main
            // application thread's sleep time.
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) { /* Ignore */
        }
        for (int i = 0; i < t.length; i++)
            Print.printnb("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        while (true)
            Thread.yield();
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年8月22日 zhuwuming creat
 */
