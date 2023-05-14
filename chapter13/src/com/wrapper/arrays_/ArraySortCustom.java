package com.wrapper.arrays_;

import java.util.Arrays;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ArraySortCustom {
    public static void bubbleSort(int[] value) {
        int temp = 0;
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = 0; j < value.length - 1 - i; j++) {
                if (value[j] > value[j + 1]) {
                    temp = value[j + 1];
                    value[j + 1] =  value[j];
                    value[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] integers = {1000, 20,10, 90, 90, 40, 302, 1000};
        bubbleSort(integers);
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.binarySearch(integers, 1000));
    }
}
