/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年6月22日
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
 * @Type Generics2.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月22日 下午4:34:26
 * @version 
 */
public class Generics2<T> {
    T kindT;

    public T get() {
        return kindT;
    }

    public Generics2(T kind) {
        // TODO Auto-generated constructor stub
        kindT = kind;
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月22日 Wuming creat
 */
