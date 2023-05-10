package com.exception_.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02 {

    public static void func() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
    public static void main(String[] args) {

        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");

    }
}


