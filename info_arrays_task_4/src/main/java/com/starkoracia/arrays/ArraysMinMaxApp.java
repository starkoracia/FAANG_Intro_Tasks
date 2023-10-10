package com.starkoracia.arrays;

import java.util.random.RandomGenerator;

public class ArraysMinMaxApp {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGenerator.of("L128X1024MixRandom");
        for (int i = 0; i < 100; i++) {
            int nextInt = randomGenerator.nextInt(100);
            System.out.println(nextInt);
        }
    }
}