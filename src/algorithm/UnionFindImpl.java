/*
 * Project: ProgramExercise
 * 
 * File Created at 2017年8月17日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package algorithm;

/**
 * @Type UnionFindImp.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月17日 上午9:26:51
 * @version 
 */
public class UnionFindImpl implements UnionFind {

    int[] arrayID;

    @Override
    public void UF(int N) {
        arrayID = new int[N];
        for (int i = 0; i < arrayID.length; i++) {
            arrayID[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if (arrayID[p] != arrayID[q]) {
            for (int i = 0; i < arrayID.length; i++) {
                if (arrayID[i] == arrayID[p]) {
                    arrayID[i] = arrayID[q];
                }
            }
        }
    }

    @Override
    public int find(int p) {
        return arrayID[p];
    }

    @Override
    public boolean connected(int p, int q) {
        if (arrayID[p] == arrayID[q]) {
            return true;
        }
        return false;
    }

    @Override
    public int count() {
        return arrayID.length;
    }

    public static void main(String[] args) {
        UnionFind unionFind = new UnionFindImpl();
        unionFind.UF(10);
        unionFind.union(1, 2);
        unionFind.union(2, 3);
        unionFind.union(4, 3);
        System.out.println(unionFind.connected(1, 4));
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年8月17日 zhuwuming creat
 */
