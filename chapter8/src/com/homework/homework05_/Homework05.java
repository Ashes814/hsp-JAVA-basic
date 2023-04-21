package com.homework.homework05_;

public class Homework05 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(1000);
        Worker worker = new Worker(1000);
        Teacher teacher = new Teacher(1000, 10, 8);
        Scientist scientist = new Scientist(1000, 1000);
        Peasant peasant = new Peasant(1000);

        waiter.printSalary();
        worker.printSalary();
        teacher.printSalary();
        scientist.printSalary();
        peasant.printSalary();
    }
}

class Employee {
    private double basicSalary;
    private double totalSalary;

    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public void printSalary() {
        System.out.println("Salary: " + this.getBasicSalary());
    }
}

class Worker extends Employee {
    public Worker(double basicSalary) {
        super(basicSalary);
    }
}

class Peasant extends Employee {
    public Peasant(double basicSalary) {
        super(basicSalary);
    }
}

class Scientist extends Employee {
    private double yearBonus;

    public Scientist(double basicSalary, double yearBonus) {
        super(basicSalary);
        this.yearBonus = yearBonus;
        this.setTotalSalary(this.getBasicSalary() + this.yearBonus);
    }

    @Override
    public void printSalary() {

        System.out.println("Sci Salary: " + this.getTotalSalary());

    }

}

class Teacher extends Employee {
    private int workDays;
    private double courseFee;

    public Teacher(double basicSalary, int workDays, double courseFee) {
        super(basicSalary);
        this.workDays = workDays;
        this.courseFee = courseFee;
        this.setTotalSalary(this.getBasicSalary() + this.workDays * this.courseFee);
    }


    public void printSalary() {

        System.out.println("Teacher Salary: " + this.getTotalSalary());

    }
}

class Waiter extends Employee {
    public Waiter(double basicSalary) {
        super(basicSalary);
    }
}