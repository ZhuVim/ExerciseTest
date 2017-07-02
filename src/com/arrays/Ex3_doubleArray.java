package com.arrays;

import java.util.Arrays;

public class Ex3_doubleArray {

    private int x;
    private int y;
    private double max;
    private double min;

    public Ex3_doubleArray(int x, int y, double max, double min) {
        // TODO Auto-generated constructor stub
        this.x = x;
        this.y = y;
        this.max = max;
        this.min = min;
    }

    public Ex3_doubleArray() {
        // TODO Auto-generated constructor stub
    }

    private double[][] creatDouble() {
        double[][] array = new double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = Math.random() * (max - min) + min;
            }
        }
        return array;
    }

    public void print() {
        System.out.println(Arrays.deepToString(creatDouble()));
    }

    public static void main(String[] args) {
        Ex3_doubleArray ex3_doubleArray = new Ex3_doubleArray();
        //    Ex3_doubleArray ex3_doubleArray=new Ex3_doubleArray(4, 5, 4.22, 1.33);

        ex3_doubleArray.print();

    }

}
