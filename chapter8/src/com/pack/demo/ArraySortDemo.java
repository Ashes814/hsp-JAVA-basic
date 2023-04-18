package com.pack.demo;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 3, 4, 3, 6, 7, 8, 4, 2, 20};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
