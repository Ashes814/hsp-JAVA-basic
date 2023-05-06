package com.advancedOOP.anonymousClass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        new CellPhone().alarmclock(new Bell(){

            @Override
            public void ring() {
                System.out.println("Get Up you fool!");
            }
        });

        new CellPhone().alarmclock(new Bell(){
            public void ring() {
                System.out.println("Go to school you fool!");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) {
        bell.ring();

    }
}
