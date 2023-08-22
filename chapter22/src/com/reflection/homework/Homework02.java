package com.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("java.io.File");
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor c: constructors) {
            System.out.println(c);
        }
        Constructor constructor = cls.getDeclaredConstructor(String.class);
        String fileAllPath = "/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter22/src/com/reflection/homework/mynew.txt";
        Object o = constructor.newInstance(fileAllPath);
        Method cf = cls.getDeclaredMethod("createNewFile");
        cf.invoke(o);


    }
}
