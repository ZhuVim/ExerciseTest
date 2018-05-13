package com.generics;

public interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
    Void set(T arg);
}
