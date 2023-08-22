package com.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.reflection.homework.PrivateTest");
        Object o = cls.newInstance();
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "AAA");
        Method getN = cls.getMethod("getName");
        String n = (String) getN.invoke(o);
        System.out.println(n);

    }
}

class PrivateTest {
    private String name = "hellokitty";
    public String getName() {
        return this.name;
    }
}