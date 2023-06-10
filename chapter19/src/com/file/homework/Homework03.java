package com.file.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter19/src/com/file/homework/dog.properties";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(filePath);
        prop.load(fis);
        String name = prop.getProperty("name");
        String ageString = prop.getProperty("age");
        int age = new Integer(ageString);
        String color = prop.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
    }
}


class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}