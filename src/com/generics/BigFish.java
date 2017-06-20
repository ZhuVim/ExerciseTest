package com.generics;

public class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {

            @Override
            public BigFish next() {
                // TODO Auto-generated method stub
                return new BigFish();
            }
        };
    }

    public String toString() {
        return "Big Fish " + id;
    }
}
