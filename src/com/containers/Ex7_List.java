/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年8月18日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.containers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Type Ex7_List.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月18日 下午3:02:55
 * @version 
 */
public class Ex7_List {
    static void printIterator(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) throws Exception {
        List<String> arrayList = new ArrayList<String>();
        List<String> linkList = new LinkedList<String>();
        arrayList = com.until.Countries.names(10);
        linkList = com.until.Countries.names(10);
        int listIndex = 0;
        Iterator<String> inIterator = arrayList.iterator();
        ListIterator<String> listIterator = (ListIterator<String>) linkList.listIterator();
        System.out.println("******插入前******");
        printIterator(arrayList.iterator());

        while (listIterator.hasNext()) {
            arrayList.add(listIndex, listIterator.next());
            listIndex += 2;
        }
        System.out.println("******从前插入后******");
        printIterator(arrayList.iterator());
        listIndex = 0;
        System.out.println("******从后插入后******");
        while (listIterator.hasPrevious()) {
            arrayList.add(listIndex, listIterator.previous());
            listIndex += 2;
        }
        printIterator(arrayList.iterator());
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年8月18日 zhuwuming creat
 */
