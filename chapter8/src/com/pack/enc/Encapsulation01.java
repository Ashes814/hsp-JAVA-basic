package com.pack.enc;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("lmlaaaa", 8848, 18);

        person.setSalary(9949);
    }
}

class Person {
    public String name;
    private double salary;
    int age;

    Person(String name, double salary, int age) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {

            System.out.println("姓名长度在2-6之间，已将姓名设置为“NO NAME”");
            this.name = "NO NAME";
        }

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
