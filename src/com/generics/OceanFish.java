package com.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class OceanFish {
    public static void eat(BigFish bigFish, LittleFish littleFish) {
        System.out.println(bigFish + " eat " + littleFish);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<LittleFish> line = new LinkedList<LittleFish>();
        Generators.fill(line, LittleFish.generator(), 15);
        List<BigFish> fishs = new ArrayList<BigFish>();
        Generators.fill(fishs, BigFish.generator(), 8);
        for (LittleFish c : line) {
            eat(fishs.get(random.nextInt(fishs.size())), c);
        }
    }

}
