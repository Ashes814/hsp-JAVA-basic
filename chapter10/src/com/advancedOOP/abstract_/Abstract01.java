package com.advancedOOP.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract public void work();

    public String getName() {
        return name;
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println(this.getName() + "is Common is working");

    }
}