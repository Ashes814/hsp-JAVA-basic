package com.pack.modifier.m1;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        System.out.println(this.n1);
        System.out.println(this.n2);
        System.out.println(this.n3);
        System.out.println(this.n4);
    }
}

