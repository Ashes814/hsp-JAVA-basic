package com.wrapper;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;

        // mannually
        Integer integer = new Integer(n1);
        System.out.println(integer);
        System.out.println(Integer.valueOf(n1));


        int n3 = integer.intValue();


        // auto
        int n2 = 8848;
        Integer integer2 = n2;

        int n4 = integer;
    }
}
