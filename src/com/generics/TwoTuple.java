package com.generics;

public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        // TODO Auto-generated constructor stub
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> swe = new TwoTuple<String, Integer>("234", 234);
        String string = "swerwr";
    }
}
