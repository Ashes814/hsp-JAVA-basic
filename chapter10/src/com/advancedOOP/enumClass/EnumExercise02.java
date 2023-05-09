package com.advancedOOP.enumClass;

/**
 * @author 欧欧
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        for (Week weekDay: Week.values()) {
            System.out.println(weekDay);
        }
    }
}

@Deprecated
enum Week {
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY");
    private String name;
    private Week(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return this.name;
    }
}
