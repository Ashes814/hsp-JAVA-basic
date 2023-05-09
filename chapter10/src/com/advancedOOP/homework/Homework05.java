package com.advancedOOP.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String name = "AAA";


    public void f1() {
        class B {
            private final String name = "BBBB" ;
            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }

        B b = new B();
        b.show();

    }

}