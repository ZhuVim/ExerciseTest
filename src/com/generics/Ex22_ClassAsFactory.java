/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年6月21日
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

import java.lang.reflect.Constructor;

import test1.Employee;

/**
 * @Type Ex22.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月21日 上午9:50:55
 * @version 
 */
public class Ex22_ClassAsFactory<T> {
    Class<T> kindClass;

    public Ex22_ClassAsFactory(Class<T> kindClass) {
        // TODO Auto-generated constructor stub
        this.kindClass = kindClass;
    }

    public T creat(int arg) {
        try {
            for (Constructor<?> ctor : kindClass.getConstructors()) {
                Class<?>[] params = ctor.getParameterTypes();
                if (params.length == 1) {
                    if (params[0] == int.class) {
                        return kindClass.cast(ctor.newInstance(arg));
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String[] args) {
        Ex22_ClassAsFactory<Employee> feAsFactory = new Ex22_ClassAsFactory<Employee>(
                Employee.class);
        Employee employee = feAsFactory.creat(1);
        if (employee == null) {
            System.out.println("Employ cannot be insttantiated");
        }
        Ex22_ClassAsFactory<Integer> fiAsFactory = new Ex22_ClassAsFactory<Integer>(Integer.class);
        Integer integer = fiAsFactory.creat(0);
        if (integer == null) {
            System.out.println("Integer cannot be instantiated");
        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月21日 Wuming creat
 */
