/*
 * Project: Test
 * 
 * File Created at 2017年6月16日
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
 * @Type TwoTuple.java
 * @Desc 
 * @author Wuming
 * @date 2017年6月16日 下午2:50:17
 * @version 
 */
public class FourTuple<A, B, C, D> extends Holder3<A, B, C> {
    public final D fourD;

    public FourTuple(A a, B b, C c, D d) {
        // TODO Auto-generated constructor stub
        super(a, b, c);
        fourD = d;
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年6月16日 Wuming creat
 */
