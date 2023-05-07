package com.advancedOOP.enumClass;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}


class Season {
    private String name;
    private String desc;

    public static final Season SPRING = new Season("Spring","Warm");
    public static final Season SUMMER = new Season("SUMMER","Hot");
    public static final Season AUTUMN = new Season("AUTUMN","Cool");
    public static final Season WINTER = new Season("WINTER","Cold");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    @Override
    public String toString() {
        return this.getName() + this.getDesc();
    }
}
