package com.advancedOOP.anonymousClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();


    }
}

class Outer04 {
    private int n1 = 10;
    public void method() {
        // 匿名内部类
        // tiger的运行类型就是这个匿名内部类
        /*
        * class XXXX implements A {}
        *
        *
        * */
        A tiger = new A() {
            @Override
            public void cry() {
                System.out.println("Tiger Crying...");
            }
        };

        System.out.println(tiger.getClass());

        new Father("f"){

        }.test();


        tiger.cry();
    }
}

interface A {
    public void cry();
}

class Father {

    private String name;
    public Father(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("Test");

    }
}
