package com.containers;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex2_genMapSet {
    public static void main(String[] args) {
        TreeMap<String, String> map = null;
        try {
            map = new TreeMap<String, String>(Countries.namesMap(7));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        TreeSet<String> set = null;
        try {
            set = new TreeSet<String>(Countries.namList(7));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String b = null;
        for (String s : map.keySet())
            if (s.startsWith("C")) {
                b = s;
                break;
            }
        Map<String, String> aMap = map.headMap(b);
        Set<String> aSet = set.headSet(b);
        System.out.println("aMap = " + aMap);
        System.out.println("aSet = " + set);
    }
}
