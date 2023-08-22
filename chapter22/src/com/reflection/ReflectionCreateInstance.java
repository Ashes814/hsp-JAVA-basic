package com.reflection;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ReflectionCreateInstance {
    public static void main(String[] args) throws ReflectiveOperationException{
        //1. get User Class
        Class<?> cls = Class.forName("com.reflection.User");
        //2.public no-parameter constructor
        Object o = cls.newInstance();
        System.out.println(o);
        //3.public parameter constructor
        Constructor<?> constructor = cls.getConstructor(String.class);
        Object o1 = constructor.newInstance("ABC");
        System.out.println(o1);

        //4.no-public parameter constructor
        Constructor<?> constructor2 = cls.getDeclaredConstructor(int.class, String.class);
        constructor2.setAccessible(true);
        Object o2 = constructor2.newInstance(19, "XYZ");
        System.out.println(o2);
    }
}

class User {
    private int age;
    private String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    private User (int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}