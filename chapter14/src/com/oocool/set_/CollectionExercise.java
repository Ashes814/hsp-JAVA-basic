package com.oocool.set_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog1", 10);
        Dog dog2 = new Dog("dog2", 100);
        Dog dog3 = new Dog("dog3", 1000);

        List dogArray = new ArrayList();
        dogArray.add(dog1);
        dogArray.add(dog2);
        dogArray.add(dog3);

        for (Object dog : dogArray) {
            System.out.println(dog);

        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getName() + this.getAge();
    }
}
