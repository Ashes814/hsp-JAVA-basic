package com.oocool.set_;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/**
 * @author 欧欧
 * @version 1.0
 */
public class HashSetExercise2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("a", 1, new MyDate(1999, 9, 10)));
        hashSet.add(new Employee2("b", 2, new MyDate(1998, 9, 10)));
        hashSet.add(new Employee2("c", 3, new MyDate(1997, 9, 10)));

        System.out.println(hashSet);
        hashSet.add(new Employee2("a",3, new MyDate(1999, 9, 10)));
        System.out.println(hashSet);
    }
}

class Employee2 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee2(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && birthday.equals(birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
