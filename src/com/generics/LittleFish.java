package com.generics;

public class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {

            @Override
            public LittleFish next() {
                // TODO Auto-generated method stub
                return new LittleFish();
            }
        };
    }

    public String toString() {
        return "Little Fish " + id;
    }
}
