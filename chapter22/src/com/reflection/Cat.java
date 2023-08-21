package com.reflection;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Cat {
    private String name = "招财猫";
    public void hi() { //成员方法
        System.out.println("hi " + name);
    }

    public void cry() {
        System.out.println("Mew Mew");
    }
}
