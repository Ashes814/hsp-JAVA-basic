package com.homework.homework10_;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("a", 1, "phy", 'm', 1000);
        Object doctor2 = new Doctor("a", 1, "phy", 'm', 1000);

        System.out.println(doctor1.equals(doctor2));

    }
}

class Doctor {
    private String name;
    private int age;
    private String dept;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String dept, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Doctor) {
            Doctor newObj = (Doctor) obj;
            return (this.getAge() == newObj.getAge() && this.getName().equals(newObj.getName()) &&
                    this.getGender() == newObj.getGender() && this.getSalary() == newObj.getSalary() &&
                    this.getDept().equals(newObj.getDept()));
        } else {
            return false;
        }

    }
}
