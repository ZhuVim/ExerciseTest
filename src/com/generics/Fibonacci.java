/*
 * Project: Test
 * 
 * File Created at 2017年6月15日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.generics;

/**
 * @Type Fibonacci.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月15日 下午5:22:25
 * @version 
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public Integer next() {
        return frib(count++);
    }

    private int frib(int n) {
        if (n <= 1)
            return 1;
        else
            return frib(n - 1) + frib(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(fibonacci.next());
        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月15日 Wuming creat
 */
