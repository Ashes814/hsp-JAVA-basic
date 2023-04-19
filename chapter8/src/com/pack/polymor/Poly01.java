package com.pack.polymor;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("yellow");
        Bone bigBone = new Bone("Big Bone");
        tom.feed(dog, bigBone);

        Animal cat = new Cat("colorful");
        Fish fish = new Fish("fish");
        tom.feed(cat, fish);


    }
}
