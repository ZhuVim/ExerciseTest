package com.arrays;

import java.util.ArrayList;

import com.generics.Generator;

public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> gen, int quantity) {
        // TODO Auto-generated constructor stub
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}