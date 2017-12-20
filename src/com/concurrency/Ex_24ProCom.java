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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Type Ex_24ProCom.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月19日 下午4:37:23
 * @version 
 */
public class Ex_24ProCom {
    static int commodity = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.setConsumer(consumer);
        consumer.setProducer(producer);
        executorService.execute(producer);
        executorService.execute(consumer);
        TimeUnit.SECONDS.sleep(3);
        executorService.shutdownNow();
    }
}

class Producer implements Runnable {
    Consumer consumer;

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            // TODO Auto-generated method stub
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (Ex_24ProCom.commodity != 0) {
                        System.out.println("wait consumer");
                        wait();
                    }
                }
                synchronized (consumer) {
                    Ex_24ProCom.commodity = 1;
                    System.out.println("Producer commdity " + Ex_24ProCom.commodity);
                    consumer.notifyAll();
                }
            }

        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Producer InterruptedException");
        }

    }

}

class Consumer implements Runnable {
    Producer producer;

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            // TODO Auto-generated method stub
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (Ex_24ProCom.commodity == 0) {
                        System.out.println("wait producer");
                        wait();
                    }
                }
                synchronized (producer) {
                    Ex_24ProCom.commodity = 0;
                    System.out.println("Consumer commdity " + Ex_24ProCom.commodity);
                    producer.notifyAll();
                }
            }

        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Producer InterruptedException");
        }

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
