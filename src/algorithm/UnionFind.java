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
 * @Type UnionFind.java
 * @Desc 
 * @author zhuwuming
 * @date 2017年8月17日 上午9:22:45
 * @version 
 */
public interface UnionFind {
    void UF(int N);

    void union(int p, int q);

    int find(int p);

    boolean connected(int p, int q);

    int count();
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年8月17日 zhuwuming creat
 */
