package com.advancedOOP.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal {
    abstract public void shout();
}

class Cat extends Animal {
    public void shout() {
        System.out.println("Cat MEW MEW");
    }
}class Dog extends Animal {
    public void shout() {
        System.out.println("Dog Woof Woof");
    }
}