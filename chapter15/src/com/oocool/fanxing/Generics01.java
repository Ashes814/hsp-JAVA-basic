package com.oocool.fanxing;

import java.util.ArrayList;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Generics01 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("1"));
        arrayList.add(new Dog("2"));
        arrayList.add(new Dog("3"));
//        arrayList.add(new Cat("4"));

        for (Dog o: arrayList) {
            System.out.println(o);
            o.dogMethod();
        }
    }
}


class Dog {
  String name;

    public Dog(String name) {
        this.name = name;
    }

    public void dogMethod() {
        System.out.println("I am dog");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}


class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}