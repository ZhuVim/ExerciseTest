package com.generics;

public abstract class Ex34SelfReturn<T extends Ex34SelfReturn<T>> {
    abstract T get(T kind);

    T test() {
        return get(null);
    }
}
