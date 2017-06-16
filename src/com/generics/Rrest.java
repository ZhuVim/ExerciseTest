/*
 * Project: Test
 * 
 * File Created at 2017年5月23日
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
 * @Type Rrest.java
 * @Desc 
 * @author Wuming
 * @date 2017年5月23日 下午2:34:47
 * @version 
 */
public class Rrest {
    public static byte[] hexStr2Bytes(String src) {
        int m = 0;
        int n = 0;
        int l = src.length() / 2;
        byte[] ret = new byte[l];
        for (int i = 0; i < l; i++) {
            m = i * 2 + 1;
            n = m + 1;
            ret[i] = uniteBytes(src.substring(i * 2, m), src.substring(m, n));
        }
        return ret;
    }

    private static byte uniteBytes(String src0, String src1) {
        byte b0 = Byte.decode("0x" + src0).byteValue();
        b0 = (byte) (b0 << 4);
        byte b1 = Byte.decode("0x" + src1).byteValue();
        byte ret = (byte) (b0 | b1);
        return ret;
    }

    public static void main(String[] args) {
        String s = "1123123";
        byte[] tts = hexStr2Bytes(s);
        byte[] qwe = { (byte) 0x11 };
        //        System.out.print(tts.toString());
        System.out.print(qwe[0]);
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年5月23日 Wuming creat
 */
