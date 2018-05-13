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
 * @Type Ex15_TestTuple.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月16日 下午2:54:44
 * @version 
 */
public class Ex15_TestTuple {
    public static <T, U, E> Holder3<T, U, E> tuple(T a, U b, E c) {
        return new Holder3<T, U, E>(a, b, c);
    }

    static Holder3<String, String, Integer> f() {
        return tuple("asd", "asd", 22);
    }

    static Holder3 f2() {
        return tuple("asd", "asd", 22);
    }

    public static void main(String[] args) {
        Holder3<String, String, Integer> dss = f();
        System.out.println(dss);
        //        Holder3<String, String, Integer> dss = f2();
        System.out.println(f2());
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
