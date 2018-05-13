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
 * @Type Ex8_SimpleThread.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月22日 下午3:17:29
 * @version 
 */
public class Ex8_SimpleThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.setDaemon(true);
            t.start();
        }
        System.out.println("Waiting for LiftOff");
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
