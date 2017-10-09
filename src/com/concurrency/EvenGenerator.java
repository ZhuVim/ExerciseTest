/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年10月9日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.concurrency;

/**
 * @Type EvenGenerator.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年10月9日 下午3:10:08
 * @version 
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        // TODO Auto-generated method stub
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年10月9日 zhuwuming creat
 */
