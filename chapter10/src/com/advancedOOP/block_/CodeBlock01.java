package com.advancedOOP.block_;

public class CodeBlock01 {
    public static void main(String[] args) {
          new B();
//        System.out.println("=====");
//        new Movie("SB", 12);
//        System.out.println("=====");
//        new Movie("Sc", 12, "nima");
    }
}

class A {
    static {
        System.out.println("A Static Code Block");
    }

    public static int a1 = printA1();
    public static int printA1() {
        System.out.println("A Static Property");
        return 1;
    }


    {
        System.out.println("A Object Code Block");
    }

    public A() {
        System.out.println("A Constructor");
    }
}
class B extends A {
    static {
        System.out.println("B Static Code Block");
    }

    public static int b1 = printB1();
    public static int printB1() {
        System.out.println("B Static Property");
        return 1;
    }


    {
        System.out.println("B Object Code Block");
    }

    public B() {
        System.out.println("B Constructor");
    }
}


//class Movie {
//    private String name;
//    private double price;
//    private String director;
//
//
//    {System.out.println("Open the Movie, Initializing Advertisement.");}
//
//    public Movie(String name) {
//        System.out.println("Open the Movie, Initializing Advertisement2.");
//        this.name = name;
//    }
//
//    public Movie(String name, double price) {
//        System.out.println("Open the Movie, Initializing Advertisement3.");
//        this.name = name;
//        this.price = price;
//    }
//
//    public Movie(String name, double price, String director) {
//        System.out.println("Open the Movie, Initializing Advertisement.4");
//        this.name = name;
//        this.price = price;
//        this.director = director;
//    }
//}
