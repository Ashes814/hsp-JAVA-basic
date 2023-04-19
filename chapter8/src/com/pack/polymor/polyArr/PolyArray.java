package com.pack.polymor.polyArr;

public class PolyArray {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Student s1 = new Student();
        Student s2 = new Student();

        Person[] pArray = {p, t1, t2, s1, s2};
        pArray[0].say();


        ((Teacher) pArray[1]).teach();

    }
}

class Person {
    private String name;
    private int age;

    public void say() {
        System.out.println("Person SAy");
//        return "Name: " + name + "Age: " + age;

    }
}

class Teacher extends Person {
    private double salary;

    public void teach() {
        System.out.println("Teaching you!");
    }
}

class Student extends Person {
    private double score;

    public void study() {
        System.out.println("I am Studying!");
    }
}