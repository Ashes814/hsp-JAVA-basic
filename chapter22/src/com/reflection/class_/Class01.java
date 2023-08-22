package com.reflection.class_;

import com.reflection.Cat;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Class01 {
    public static void main(String[] args) throws Exception {
        //代码阶段，编译阶段
        Class cls1 = Class.forName("com.reflection.Cat"); // often used in properties
        System.out.println(cls1);
        //加载阶段
        System.out.println(Cat.class);// often used in parameter transition
        //运行阶段
        Cat cat = new Cat();
        System.out.println(cat.getClass());
        //类加载器
        //(1)先得到类加载器car
        ClassLoader classLoader = cat.getClass().getClassLoader();
        //(2)get Class object by class loader
        Class cls4 = classLoader.loadClass("com.reflection.Cat");
        System.out.println(cls4);
        //基本数据类型.class
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        //包装类.type
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
    }
}
