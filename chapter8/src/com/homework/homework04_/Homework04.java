package com.homework.homework04_;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("MM", 1000, 10);
        Worker worker = new Worker("WW", 1000, 10);

        manager.printSalary();
        worker.printSalary();

    }
}

class Employee {
    private String name;
    private double salary;
    private int workdays;
    public double level;

    public Employee(String name, double salary, int workdays) {
        this.name = name;
        this.salary = salary;
        this.workdays = workdays;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkdays() {
        return workdays;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public void printSalary() {
        System.out.println("Name: " + this.getName() + " Salary: " + this.getSalary());
    }
}


class Manager extends Employee {

    public Manager(String name, double salary, int workdays) {
        super(name, salary, workdays);
        this.level = 1.2;
        setSalary(1000 + salary * workdays * this.level);
    }

    public void printSalary() {
        System.out.println("Manager");
        super.printSalary();
    }


}

class Worker extends Employee {
    public Worker(String name, double salary, int workdays) {
        super(name, salary, workdays);
        this.level = 1.0;
        setSalary(salary * workdays * this.level);
    }

    public void printSalary() {
        System.out.println("Worker");
        super.printSalary();
    }

}