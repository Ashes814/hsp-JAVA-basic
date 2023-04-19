package com.pack.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); // 40
        System.out.println(a.sum1()); // 30
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        System.out.println("sum这个有吊用");
        System.out.println(i);
        return i + 10;
    }

    public int getI() {
        System.out.println("这个没吊用");
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        System.out.println("这个有吊用");
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}
