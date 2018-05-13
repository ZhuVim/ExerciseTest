/*
 * Project: Test
 * 
 * File Created at 2017��6��15��
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
 * @Type IterableFibonacci.java
 * @Desc 
 * @author Wuming
 * @date 2017��6��15�� ����6:38:23
 * @version 
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return IterableFibonacci.this.next();//this��ʾIterableFibonacci��ķ������̳п���ʹ�ø���ķ�����
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
 * 2017��6��15�� Wuming creat
 */
