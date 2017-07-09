/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年7月4日
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
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Type Ex01_country.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年7月4日 上午9:08:23
 * @version 
 */
public class Ex01_country {
    private static Random rnd = new Random(47);

    public static void main(String[] args) {

        String[] nameString = new String[] { "china", "japan", "kore" };
        List<String> listCountry = new ArrayList<String>();
        listCountry.add("china");
        listCountry.add("japan");
        listCountry.add("kore");
        listCountry.add("English");
        Collections.sort(listCountry);
        System.out.println("sort = " + listCountry);
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(listCountry, rnd);
            System.out.println(listCountry);
        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年7月4日 zhuwuming creat
 */
