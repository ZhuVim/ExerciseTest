package com.generics;

public interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}
