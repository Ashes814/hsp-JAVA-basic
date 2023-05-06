package com.advancedOOP.anonymousClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IA() {
            @Override
            public void show() {
                System.out.println("Your mother boom");
            }
        });
    }

    public static void f1(IA ia) {
        ia.show();
    }
}

interface IA {
    void show();

}
