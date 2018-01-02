/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年12月27日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package AliCodeStandards;

import java.util.ArrayList;
import java.util.List;

/**
 * @Type TestList.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年12月27日 下午3:39:22
 * @version 
 */
public class TestList {
    public static void main(String[] args) {
        //        String[] str = new String[] { "you", "wu" };
        //        Listlist = Arrays.asList(str);
        //        list.add("yangguanbao");
        //        str[0] = "gujin";
        //        Iterator<String> iterator = list.iterator();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (String item : list) {
            if ("3".equals(item)) {
                list.remove(item);
            }
        }
        //        Iterator<String> iterator = list.iterator();
        //        while (iterator.hasNext()) {
        //            System.out.println(iterator.next());
        //        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年12月27日 zhuwuming creat
 */
