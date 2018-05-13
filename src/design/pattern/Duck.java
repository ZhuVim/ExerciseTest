/*
 * Project: ProgramExercise
 * 
 * File Created at 2018年5月13日
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
 * @Type Duck.java
 * @Desc 
 * @author zhuwuming
 * @date 2018年5月13日 下午4:46:45
 * @version 
 */
public class Duck extends Sort {

    int weight = 0;
    String name;

    public Duck(int weight, String name) {
        // TODO Auto-generated constructor stub
        this.weight = weight;
        this.name = name;
    }

    @Override
    protected int comparable(Object a, Object b) {
        // TODO Auto-generated method stub
        if (((Duck) a).weight > ((Duck) b).weight) {
            return 1;
        } else if (((Duck) a).weight == ((Duck) b).weight) {
            return 0;
        }

        return -1;
    }

    public String toString() {
        return name + " Duck " + weight + " weight" + "\n";

    }

    public static void main(String[] args) {
        Duck[] ducks = { new Duck(2, "aa"), new Duck(1, "bb"), new Duck(6, "cc"),
                new Duck(5, "dd"), new Duck(9, "ee") };
        ducks[1].sort(ducks);
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年5月13日 zhuwuming creat
 */
