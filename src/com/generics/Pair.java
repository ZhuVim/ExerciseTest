/*
 * Project: Test
 * 
 * File Created at 2017年6月12日
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
 * @Type Pair.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月12日 上午9:15:00
 * @version 
 */
public class Pair<T> {
    private T firstT;
    private T second;

    public T getFirstT() {
        return firstT;
    }

    public void setFirstT(T firstT) {
        this.firstT = firstT;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static void main(String[] args) {

    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月12日 Wuming creat
 */
