package com.advancedOOP.enumClass;

/**
 * @author 欧欧
 * @version 1.0
 */
public class EnumMethods {
    public static void main(String[] args) {
        SeasonEnum2 autumn = SeasonEnum2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());

        for (SeasonEnum2 season: SeasonEnum2.values()) {
            System.out.println(season);
        }

        System.out.println(SeasonEnum2.AUTUMN.compareTo(SeasonEnum2.SPRING));

    }
}

enum SeasonEnum2 {
    SPRING("Spring","Warm"),
    SUMMER("SUMMER","Hot"),
    AUTUMN("AUTUMN","Cool"),
    WINTER("WINTER","Cold");

    private String name;
    private String desc;




    private SeasonEnum2(String name, String desc) {
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
