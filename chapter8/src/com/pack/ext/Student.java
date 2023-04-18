package com.pack.ext;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Score: " + score);
    }
}
