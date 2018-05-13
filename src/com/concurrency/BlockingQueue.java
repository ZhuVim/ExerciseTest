/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月19日
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

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Type BlockingQueue.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月19日 下午8:54:10
 * @version 
 */
public class BlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        final LinkedBlockingQueue<RunClass> queue = new LinkedBlockingQueue<RunClass>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        RunClass runClass = queue.take();
                        runClass.run();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            }
        }).start();

        for (int i = 0; i < 5; i++) {
            TimeUnit.SECONDS.sleep(1);
            queue.add(new RunClass(i));
        }

    }
}

class RunClass implements Runnable {
    private int num;

    public RunClass(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("第 " + num + " 开始运行");
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月19日 zhuwuming creat
 */
