package com.reflection;

import java.lang.reflect.Method;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Reflection02  {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }
    // traditional method
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("Traditonal Way: " + (end - start));
    }
    // reflection method
    public static void m2() throws Exception{
        Class cls = Class.forName("com.reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("Reflection Way: " + (end - start));
    }

    //reflection optimize
    public static void m3() throws Exception{
        Class cls = Class.forName("com.reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("Reflection Way: " + (end - start));
    }
}
