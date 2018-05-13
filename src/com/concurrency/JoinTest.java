package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JoinTest extends Thread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++) {
            System.out.println("run " + i + " Thread");
        }
    }

    public static void main(String[] args) {

        // ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
        // unit, workQueue);
        ExecutorService executorService = Executors.newFixedThreadPool(12);
        JoinTest joinTest = new JoinTest();
        executorService.execute(joinTest);
        joinTest.start();
        try {
            joinTest.join();
            System.out.println("main is over");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
        // maximumPoolSize, keepAliveTime, unit, workQueue);

    }
}
