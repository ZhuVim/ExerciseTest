/*
 * Project: Test
 * 
 * File Created at 2017年6月16日
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
 * @Type GenericMethods.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月16日 上午10:00:55
 * @version 
 */
public class GenericMethods {
    private static long classID = 0;
    final long ID = classID++;

    public <T, U, E> void f(T x, U y, E e) {
        System.out.println("第一个参数T的" + x.getClass().getName());
        System.out.println("第一个参数的" + y.getClass().getName());
        System.out.println("第一个参数的" + e.getClass().getName());
    }

    public static void main(String[] args) {
        new GenericMethods().f(3, 3.22, "aawe");
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月16日 Wuming creat
 */
