package com.pack.polymor._detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
//        System.out.println(cat.catAge);
        cat.run();
        cat.drink();
        cat.sleep();

        //向下转型
        Cat cat2 = (Cat) cat;
        cat2.catchMouse();

        System.out.println(cat.age);
        System.out.println(cat2.age);
    }
}
