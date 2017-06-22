/*
h * Project: Test
 * 
 * File Created at 2017年6月14日
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
 * @Type Holder3.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月14日 上午9:54:26
 * @version 
 */
public class Holder3<T, U, E> {
    public T aT;
    public U bU;
    public E cE;

    public T getaT() {
        return aT;
    }

    public void setaT(T aT) {
        this.aT = aT;
    }

    public U getbU() {
        return bU;
    }

    public void setbU(U bU) {
        this.bU = bU;
    }

    public E getcE() {
        return cE;
    }

    public void setcE(E cE) {
        this.cE = cE;
    }

    public Holder3(T a, U b, E c) {
        // TODO Auto-generated constructor stub
        this.aT = a;
        this.bU = b;
        this.cE = c;
    }

    public String toString() {
        return "(" + aT + bU + cE + "）";
    }

    public static void main(String[] args) {
        Holder3<String, Pair<String>, Integer> holder3 = new Holder3<String, Pair<String>, Integer>(
                "313", new Pair<String>(), 3);
        System.out.println(holder3.getaT());
        System.out.println(holder3.getbU());
        System.out.println(holder3.getcE());
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月14日 Wuming creat
 */
