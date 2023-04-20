package com.pack.polymor.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager jack = new Manager("tom", 2500, 20000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnal(tom);
        polyParameter.showEmpAnnal(jack);
        polyParameter.testWork(tom);
        polyParameter.testWork(jack);
 
    }

    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            Worker newE = (Worker) e;
            newE.work();
        } else if (e instanceof Manager) {
            Manager newE = (Manager) e;
            newE.manage();
        } else {
            System.out.println("No job");
        }
//        e.
    }
}


class Employee {
    public String name;
    private double salaryMonth;

    public Employee(String name, double salaryMonth) {
        this.name = name;
        this.salaryMonth = salaryMonth;
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public double getAnnual() {
        System.out.println("Employee getAnnual");
        return this.salaryMonth * 12;
    }
}

class Worker extends Employee {

    public Worker(String name, double salaryMonth) {
        super(name, salaryMonth);
    }

    @Override
    public double getAnnual() {
        System.out.println("Worker getAnnual");
        return this.getSalaryMonth() * 12;
    }

    public void work() {
        System.out.println("I am Working");
    }
}

class Manager extends Employee {
    private double bonus;


    public Manager(String name, double salaryMonth, double bonus) {
        super(name, salaryMonth);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        System.out.println("Manager getAnnual");
        return this.getSalaryMonth() * 12 + this.bonus;
    }

    public void manage() {
        System.out.println("I am Managing");

    }
}