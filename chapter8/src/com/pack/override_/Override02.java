package com.pack.override_;

public class Override02 {
    public static void main(String[] args) {
        Person p = new Person("Jack", 18);
        Student s = new Student("Mike", 20, 8848, 99.2);

        System.out.println(p.say());
        System.out.println(s.say());
    }
}
