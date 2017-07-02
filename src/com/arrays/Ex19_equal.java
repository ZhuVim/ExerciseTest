package com.arrays;

import java.util.Arrays;

public class Ex19_equal {
    int data;

    public Ex19_equal(int t) {
        // TODO Auto-generated constructor stub
        data = t;
    }

    public static void main(String[] args) {
        Ex19_equal[] arr1 = new Ex19_equal[10];
        Ex19_equal[] arr2 = new Ex19_equal[10];
        Arrays.fill(arr1, new Ex19_equal(1));
        Arrays.fill(arr2, new Ex19_equal(1));
        System.out.println(Arrays.equals(arr1, arr2));

    }
}
