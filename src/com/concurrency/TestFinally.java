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

/**
 * @Type TestFinally.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月19日 下午4:03:51
 * @version 
 */
public class TestFinally {

    public static void main(String[] args) {

        System.out.println(test5());
    }

    @SuppressWarnings("finally")
    public static int test5() {
        int b = 20;

        try {
            System.out.println("try block");

            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
            return b += 15;
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            b += 50;
            return b;
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
