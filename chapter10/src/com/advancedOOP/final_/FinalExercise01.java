package com.advancedOOP.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(new Circle().calArea(2));
    }
}

class Circle {
    private final double PI;

    {
        PI = 3.14;
    }

    public double calArea(double radius) {
        return radius*radius*PI;
    }

    public int addOne(final int x) {
//        ++x;
        return x + 1;
    }

    public Circle() {
//        this.PI = 3.14;
    }
}
