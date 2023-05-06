package com.advancedOOP.innerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer().m1();

    }
}

class Outer {
    private int n1 = 100;
    public void m1 () {
        class Inner {
            public void f1() {
                System.out.println("n1 =" + n1);
            }
        }

        new Inner().f1();
    }
}
