package com.homework.homework03_;

public class Homework03 {

    public static void main(String[] args) {
        Professor professor = new Professor("Pro", 60, "Professor", 10000);
        Associate associate = new Associate("Ass", 50, "Associate", 10000);
        Mentor mentor = new Mentor("Men", 40, "Mentor", 10000);
        Teacher teacher = new Teacher("Tea", 60, "Teacher", 10000);

        professor.introduce();
        associate.introduce();
        mentor.introduce();
        teacher.introduce();
    }

}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
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

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("Teacher Name: " + this.getName() + " Age: " + this.getAge() + " Position: " + this.getPost() + " Salary: " + this.getSalary());

    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.3;
    }

    public void introduce() {
        System.out.println("Professor Name: " + this.getName() + " Age: " + this.getAge() + " Position: " + this.getPost() + " Salary: " + this.getSalary());
    }
}

class Associate extends Teacher {
    public Associate(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.2;
    }

    public void introduce() {
        System.out.println("Associate Name: " + this.getName() + " Age: " + this.getAge() + " Position: " + this.getPost() + " Salary: " + this.getSalary());
    }
}

class Mentor extends Teacher {
    public Mentor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.1;
    }

    public void introduce() {
        System.out.println("Mentor Name: " + this.getName() + " Age: " + this.getAge() + " Position: " + this.getPost() + " Salary: " + this.getSalary());
    }
}
