package com.pack.debug_;

public class DebugDemo01 {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 20);
        System.out.println(jack);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + age;
    }
}
