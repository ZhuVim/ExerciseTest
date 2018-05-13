package com.generics;

public class Holder<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public Holder() {
        // TODO Auto-generated constructor stub
    }

    public Holder(T val) {
        value = val;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}
