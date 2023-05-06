package com.advancedOOP.memberInnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.t1();


    }
}

class Outer{
    class Inner {
        public void say() {
            System.out.println("Inner");
        }
    }

    public void t1() {
        new Inner().say();
    }
}
