/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年10月9日
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
 * @Type Ex11_UnCertainState.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年10月9日 上午11:27:14
 * @version 
 */
public class Ex11_UnCertainState implements Runnable {
    int filed1 = 0;
    int filed2 = 0;

    public void changeFiled() {
        for (int i = 0; i < 10; i++) {
            filed1++;
        }
        for (int i = 0; i < 10; i++) {
            filed2++;
        }
    }

    public int readField1() {
        return filed1;
    }

    public int readField2() {
        return filed2;
    }

    public static void main(String[] args) {
        Ex11_UnCertainState unCertainState = new Ex11_UnCertainState();
        Thread thread1 = new Thread(unCertainState);
        Thread thread2 = new Thread(unCertainState);
        thread1.run();
        System.out.println(unCertainState.readField1());
        thread2.run();
        System.out.println(unCertainState.readField1());

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        changeFiled();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年10月9日 zhuwuming creat
 */
