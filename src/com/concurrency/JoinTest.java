package com.concurrency;


public class JoinTest implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++) {
            System.out.println("run " + i + " Thread");
        }
    }

    public static void main(String[] args) {
        //        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
        //                maximumPoolSize, keepAliveTime, unit, workQueue);

    }
}
