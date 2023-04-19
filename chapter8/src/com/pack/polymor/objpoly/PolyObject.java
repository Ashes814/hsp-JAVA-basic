package com.pack.polymor.objpoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry(); // 看运行类型，这里是DOG

        animal = new Cat();
        animal.cry();
    }
}
