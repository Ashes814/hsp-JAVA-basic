package com.advancedOOP.interface_;



public class Phone implements A{
    public static void main(String[] args) {
        Phone b = new Phone();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(Phone.a);

    }

}

interface A {
    int a = 23;
}
