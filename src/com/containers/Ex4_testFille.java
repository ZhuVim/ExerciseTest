package com.containers;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import com.until.ComUntil;
import com.until.TextFile;

public class Ex4_testFille {
    static Collection<String> CollectFromText(String fileName) {
        String[] sa = ComUntil.readTxtFile(fileName).split(" ");
        return Arrays.asList(sa);
    }

    static Collection<String> CollectFromText2(String fileName) {
        String[] sa = ComUntil.readTxtFile(fileName).split(" ");
        return new TreeSet<String>(new TextFile(fileName, "\\W+"));
    }

    public static void main(String[] args) {

    }
}
