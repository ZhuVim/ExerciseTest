/*
 * Project: ProgramExercise
 * 
 * File Created at 2018年5月4日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package design.pattern;

/**
 * @Type Espresso.java
 * @Desc 
 * @author zhuwuming
 * @date 2018年5月4日 下午3:03:08
 * @version 
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {

        return 1.99;
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年5月4日 zhuwuming creat
 */
