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
 * @Type Beverage.java
 * @Desc 
 * @author zhuwuming
 * @date 2018年5月4日 下午2:58:26
 * @version 
 */
public abstract class Beverage {
    String description = "Unknown B erverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年5月4日 zhuwuming creat
 */
