package com.advancedOOP.static_;

public class Test {


    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
        System.out.println(Person.total);
        System.out.println(args[0]);

    }
}


class Person {
    private int id;
    public static int total = 0;
    public static void setTotalPerson(int total) {
//        this.total = total;
        Person.total = total;
    }

    public Person() {
        total++;
        id = total;
    }
}
