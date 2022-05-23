package com.bl.array;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] elements = {1, 3, 6, 8, 10, 44, 99};
        Arrays.sort(elements);
        System.out.println("minimum number in array is " + elements[0]);
        System.out.println("maximum number in array is " + elements[6]);
    }
}
