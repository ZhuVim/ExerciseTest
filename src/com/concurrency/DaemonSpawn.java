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

/**
 * @Type DaemonSpawn.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月22日 下午2:50:25
 * @version 
 */
public class DaemonSpawn implements Runnable {
    public void run() {
        while (true) {
            Thread.yield();
        }
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
