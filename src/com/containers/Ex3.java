package com.containers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>();
        hashSet.add("china");
        hashSet.add("china");
        linkedHashSet.add("china");
        linkedHashSet.add("china");
        treeSet.add("china");
        treeSet.add("china");
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
