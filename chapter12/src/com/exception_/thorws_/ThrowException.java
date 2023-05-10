package com.exception_.thorws_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA(); // into A; A finally
        } catch (Exception e) {
            System.out.println(e.getMessage()); // made exception
        }
        ReturnExceptionDemo.methodB(); // into B; B finally
    }
}

class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("into A");
            throw new RuntimeException("made exception");
        } finally {
            System.out.println("A finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("into B");
            return;

        } finally {
            System.out.println("B finally");
        }
    }
}
