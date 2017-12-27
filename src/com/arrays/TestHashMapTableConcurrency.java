/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月20日
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

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Type TestHashMapTableConcurrency.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月20日 下午4:06:00
 * @version 
 */
public class TestHashMapTableConcurrency {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        //        map.put(null, "null");
        map.put(null, null);//HashMap可以同时为空
        //        hashtable.put("null", null);
        //        concurrentHashMap.put("null", null);
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月20日 zhuwuming creat
 */
