package com.reflection.question;

import com.reflection.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        // based on config file re.properties, create Cat object and call hi

        // traditional 1
        // 1. Using Properties class, read and write properties
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/zowcool/Desktop/Learning/hsp-JAVA-basic/chapter22/src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);

        //2. Create an object - reflection
        // new classfullpath() //wrong
        // (1) load class, return Class 类型的对象
        Class cls = Class.forName(classfullpath);
        //（2） cls is real class
        Object o =  cls.newInstance();
        System.out.println(o.getClass());
        // (3) using cls to get method - we can regard method as an object in reflection problem
        Method methodRun = cls.getMethod(method);
        System.out.println(methodRun);

        // (4) using methodRun to run
        methodRun.invoke(o);

    }
}
