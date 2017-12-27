/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月21日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.arrays;

import java.util.ArrayList;

/**
 * @Type ArrayListTest.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月21日 上午11:13:48
 * @version 
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.size());
            arrayList.add(String.valueOf(i));

        }

    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月21日 zhuwuming creat
 */
