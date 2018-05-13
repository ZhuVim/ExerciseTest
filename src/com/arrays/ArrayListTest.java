/*
 * Project: ProgramExercise
 * 
 * File Created at 2017骞�12鏈�21鏃�
 * 
 * Copyright 2016 CMCC Corporation Limited. All rights reserved.
 * 
 * This software is the confidential and proprietary information of ZYHY Company. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall use it only in accordance with the terms of the license.
 */
package com.arrays;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @Type ArrayListTest.java
 * @Desc
 * @author zhuwuming
 * @date 2017骞�12鏈�21鏃� 涓婂崍11:13:48
 * @version
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Vector<String> strings;
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.size());
            arrayList.add(String.valueOf(i));

        }

    }
}

/**
 * Revision history -------------------------------------------------------------------------
 * 
 * Date Author Note ------------------------------------------------------------------------- 2017骞�12鏈�21鏃� zhuwuming
 * creat
 */
