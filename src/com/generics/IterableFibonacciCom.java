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

import java.util.Iterator;

/**
 * @Type IterableFibonacciCom.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月16日 上午9:51:02
 * @version 
 */
public class IterableFibonacciCom implements Iterable<Integer> {

    private int n;
    private Fibonacci fibonacci = new Fibonacci();

    public IterableFibonacciCom(int count) {
        n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return fibonacci.next();//this表示IterableFibonacci类的方法，继承可以使用父类的方法。
            }

            public void remove() {

            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18))
            System.out.println(i + " ");
        new IterableFibonacci(3).next();
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
