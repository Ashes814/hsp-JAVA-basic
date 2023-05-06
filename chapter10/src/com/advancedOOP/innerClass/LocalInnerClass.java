package com.advancedOOP.innerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer().m1();
        System.out.println(new Outer());


    }
}

class Outer {
    private int n1 = 100;
    public void m1 () {
        class Inner {
            private int n1 = 800;
            public void f1() {
                System.out.println("n1 = " + n1);
                System.out.println("n1 = " + Outer.this.n1);
            }
        }

        new Inner().f1();
    }
}
