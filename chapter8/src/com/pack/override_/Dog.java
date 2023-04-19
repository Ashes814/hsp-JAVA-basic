package com.pack.override_;

public class Dog extends Animal {
    public String soak() {
        System.out.println("WOOF!");
        return null;
    }

    public void cry() {
        System.out.println("WOOF!");
    }

    public void overloadTest() {
        System.out.println("overload Test 1");
    }

    String overloadTest(int n) {
        System.out.println("overload Test 2");
        return "8848";
    }
}
