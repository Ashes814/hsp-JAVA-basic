package com.wrapper;

/**
 * @author 欧欧
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); // true

        Integer x = 128;
        Integer y = 128;

        System.out.println(x == y);

    }
}
