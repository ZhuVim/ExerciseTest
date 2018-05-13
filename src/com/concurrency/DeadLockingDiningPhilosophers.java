/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月20日
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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Type DeadLockingDiningPhilosophers.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月20日 下午1:42:04
 * @version 
 */
public class DeadLockingDiningPhilosophers {
    public static void main(String[] args) throws Exception {
        int ponder = 0;
        int size = 5;
        LinkedBlockingQueue<Chopstick> chopQueue = new LinkedBlockingQueue<Chopstick>();

        ExecutorService exec = Executors.newCachedThreadPool();
        Chopstick[] sticks = new Chopstick[size];
        for (int i = 0; i < size; i++)
            sticks[i] = new Chopstick();
        for (int i = 0; i < size; i++)
            exec.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i, ponder));
        TimeUnit.SECONDS.sleep(5);
        //        exec.shutdownNow();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月20日 zhuwuming creat
 */
