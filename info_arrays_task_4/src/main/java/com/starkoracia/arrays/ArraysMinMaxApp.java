package com.starkoracia.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class ArraysMinMaxApp {

    public static void main(String[] args) {
        Integer[] integers = generateIntArray(5);
        System.out.println(Arrays.toString(integers));

        findAndPrintMinMaxFirstWay(integers);
        findAndPrintMinMaxSecondWay(integers);
    }

    private static void findAndPrintMinMaxFirstWay(Integer[] integers) {
        int min = integers[0];
        int max = integers[0];
        for (int num : integers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Min = %d; Max = %d\n", min, max);
    }

    private static void findAndPrintMinMaxSecondWay(Integer[] integers) {
        Arrays.sort(integers);
        int min = integers[0];
        int max = integers[integers.length - 1];
        System.out.printf("Min = %d; Max = %d\n", min, max);
    }

    private static Integer[] generateIntArray(int size) {
        Integer[] integers = new Integer[size];
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        for (int i = 0; i < size; i++) {
            integers[i] = randomGenerator.nextInt(100);
        }
        return integers;
    }

}
