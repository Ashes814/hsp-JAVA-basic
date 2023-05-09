package com.advancedOOP.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        System.out.println(cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10,20));
    }
}

interface Calculator {
    public double work(double n1, double n2);
}

class Cellphone {

    public double testWork(Calculator calculator, double n1, double n2) {
        return calculator.work(n1, n2);
    }
}
