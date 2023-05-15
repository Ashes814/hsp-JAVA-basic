package com.wrapper.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        printName("Han Shun Ping");
        printName("William Jefferson Clinton");
    }

    public static void printName(String name) {
        String[] nameArray = name.split(" ");
        String firstName = nameArray[1].substring(0,1);
        System.out.println(nameArray[2] + "," + nameArray[0] + "."+firstName);

    }
}
