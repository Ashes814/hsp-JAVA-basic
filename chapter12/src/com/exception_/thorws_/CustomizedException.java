package com.exception_.thorws_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CustomizedException {
    public static void main(String[] args) {
        int age = 8;
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("age error");
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}