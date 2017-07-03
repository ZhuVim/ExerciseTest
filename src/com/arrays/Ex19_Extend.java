package com.arrays;

import java.util.Arrays;

public class Ex19_Extend extends Ex19_equal {
    public Ex19_Extend(int data) {
        // TODO Auto-generated constructor stub
        super(data);
    }

    public boolean equals(Object o) {
        return o instanceof Ex19_Extend && data == ((Ex19_equal) o).data;
    }

    public static void main(String[] args) {

        Ex19_Extend[] arr1 = new Ex19_Extend[10];
        Ex19_Extend[] arr2 = new Ex19_Extend[10];
        Arrays.fill(arr1, new Ex19_Extend(1));
        Arrays.fill(arr2, new Ex19_Extend(1));
        System.out.println(Arrays.equals(arr1, arr2));

    }
}
