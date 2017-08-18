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

/**
 * @Type Ex8_SList.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月18日 下午4:57:37
 * @version 
 */
public class Ex8_SList<E> {

    Ex8_SList<E> next;
    E thisE;

    public Ex8_SList(E thisE) {
        this.thisE = thisE;
    }

    public Ex8_SList<E> next() {
        return next;
    }

    public void add(Ex8_SList<E> para) {
        next = para;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        return next.toString();
    }

    public static void main(String[] args) {
        Ex8_SList<String> sList = new Ex8_SList<String>("one");
        sList.add(new Ex8_SList<String>("two"));
        System.out.println(sList.toString());
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
