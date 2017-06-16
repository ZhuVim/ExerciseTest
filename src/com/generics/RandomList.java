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
 * @Type RandomList.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月15日 下午3:11:44
 * @version 
 */

public class RandomList<T, U> {
    public static void main(String[] args) {
        int[] inter = { 3, 4, 2, 3, 4, 5, 2 };

        for (int i : inter) {
            System.out.println(i + " ");
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
