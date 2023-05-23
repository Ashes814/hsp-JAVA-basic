package com.oocool.fanxing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * @author 欧欧
 * @version 1.0
 */
public class GenericExe02 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("c", 100, new MyDate(8,15,2000));
        Employee emp2 = new Employee("c", 200, new MyDate(8,14,2000));
        Employee emp3 = new Employee("c", 500, new MyDate(8,15,2000));
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);


        empList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName())){
                    return MyDate.compareDate(o1.getBirthDay(), o2.getBirthDay());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee emp: empList) {
            System.out.println(emp);
        }

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthDay;

    public Employee(String name, double sal, MyDate birthDay) {
        this.name = name;
        this.sal = sal;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthDay=" + birthDay +
                '}';
    }
}

class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public static int compareDate(MyDate o1, MyDate o2) {
        if (o1.getYear() != o2.getYear()) {
            return (o1.getYear() - o2.getYear());
        }

        if (o1.getMonth() != o2.getMonth()) {
            return (o1.getMonth() - o2.getMonth());

        }

        if (o1.getDay() != o2.getDay()) {
            return (o1.getDay() - o2.getDay());
        }

        return 0;



    }
}
