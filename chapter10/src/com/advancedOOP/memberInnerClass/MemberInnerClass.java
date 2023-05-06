package com.advancedOOP.memberInnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.t1();

        Outer.Inner outer2 = new Outer().new Inner();
        outer2.say();


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
