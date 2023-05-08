package com.advancedOOP.enumClass;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);


    }
}

enum SeasonEnum {
    SPRING("Spring","Warm"),
    SUMMER("SUMMER","Hot"),
    AUTUMN("AUTUMN","Cool"),
    WHAT,
    WINTER("WINTER","Cold");

    private String name;
    private String desc;

    private SeasonEnum(){
        System.out.println("no");
    }

//    public static final Season SPRING = new Season("Spring","Warm");
//    public static final Season SUMMER = new Season("SUMMER","Hot");
//    public static final Season AUTUMN = new Season("AUTUMN","Cool");
//    public static final Season WINTER = new Season("WINTER","Cold");



    private SeasonEnum(String name, String desc) {
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