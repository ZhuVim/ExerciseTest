package com.containers;

import com.until.ComUntil;

public class Ex4_testFille {
    public static void main(String[] args) {
        String filenameString = "F:\\workspace\\test.text";
        ComUntil.WriteFile(filenameString, filenameString);
        String conten = ComUntil.readFile(filenameString);
        System.out.println();
    }
}
