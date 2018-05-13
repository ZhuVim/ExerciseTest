package com.containers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestKeySet {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        Set keys1 = map.keySet();
        Set keys2 = map.keySet();
        Set keys3 = map.keySet();
        keys1.remove(1);
        System.out.println(keys1);
        System.out.println(keys2);
        System.out.println(keys3);
        Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
        map1.put(1, "星期一");
        map1.put(2, "星期二");
        map1.put(3, "星期三");
        map1.put(4, "星期四");
        map1.put(5, "星期五");
        map1.put(6, "星期六");
        map1.put(7, "星期日");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + "\t");
        }

    }
}
