/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年10月27日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package test1;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @Type TestDigast.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年10月27日 下午8:33:53
 * @version 
 */
public class TestDigast {
    private static String src = "www.cnblogs.com/huhx";

    public static void main(String[] args) {
        jdkSHA1();
    }

    public static void jdkSHA1() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(src.getBytes());
            byte[] shaBytes = messageDigest.digest();
            System.out.println("jdk SHA 1: " + Arrays.toString((shaBytes)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年10月27日 zhuwuming creat
 */
