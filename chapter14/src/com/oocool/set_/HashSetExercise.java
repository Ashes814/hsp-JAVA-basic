package com.oocool.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 欧欧
 * @version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("a", 1));
        hashSet.add(new Employee("b", 2));
        hashSet.add(new Employee("c", 3));
        System.out.println(hashSet);
        hashSet.add(new Employee("c", 3));
        System.out.println(hashSet);


    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
