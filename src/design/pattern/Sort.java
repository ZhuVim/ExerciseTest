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
 * @Type Sort.java
 * @Desc 
 * @author zhuwuming
 * @date 2018年5月13日 下午4:31:58
 * @version 
 */
public abstract class Sort {
    public void sort(Object[] object) {
        //        Object[] copyObjects = (Object[]) object.clone();
        mergeSort(object, object, 0, object.length, 0);
    }

    private void mergeSort(Object[] sorc, Object[] dest, int low, int high, int off) {
        for (int i = low; i < high; i++) {
            for (int j = i; j < dest.length - 1; j++) {
                if (comparable(sorc[j], sorc[j + 1]) > 0) {
                    swap(sorc, j, j + 1);
                }
            }
        }
    }

    protected abstract int comparable(Object a, Object b);

    private void swap(Object[] sorce, int i, int j) {
        Object tempObject = null;
        tempObject = sorce[i];
        sorce[i] = sorce[j];
        sorce[j] = tempObject;
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
