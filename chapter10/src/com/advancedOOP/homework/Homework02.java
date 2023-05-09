package com.advancedOOP.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();

        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());

    }
}

class Frock {
    private static int currentNum = 100000;
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }
}
