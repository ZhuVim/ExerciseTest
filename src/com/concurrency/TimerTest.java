/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月11日
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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Type TimerTest.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月11日 上午11:15:08
 * @version 
 */
public class TimerTest extends TimerTask {
    final static long TIME = 3;
    static long num = 2;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(now));
        num--;
        if (num == 0) {
            cancel();
            System.out.println("Time Task stop");
        }
    }

    public static void main(String[] args) {
        Timer time = new Timer();
        time.schedule(new TimerTest(), TIME * 1000, TIME * 1000);

    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月11日 zhuwuming creat
 */
