package com.wrapper.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, 90, 80, 40, 32, 100};

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(integers));

     }
}
