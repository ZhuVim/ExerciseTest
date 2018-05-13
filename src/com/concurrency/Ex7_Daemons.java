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

import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.until.Print;

/**
 * @Type Ex7_Daemons.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月22日 下午2:28:46
 * @version 
 */
public class Ex7_Daemons {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int sleep_time = random.nextInt(100);
        System.out.println(sleep_time);
        Thread d = new Thread(new Daemon2());
        d.setDaemon(true);
        d.start();
        Print.printnb("d.isDaemon() = " + d.isDaemon() + ", ");
        TimeUnit.MILLISECONDS.sleep(sleep_time);
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
