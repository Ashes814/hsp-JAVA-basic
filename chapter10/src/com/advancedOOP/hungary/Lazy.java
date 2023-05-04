package com.advancedOOP.hungary;

public class Lazy {
    public static void main(String[] args) {

    }
}

class Cat {
    private String name;
    private static Cat cat;
    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("SB");
        }
        return cat;
    }

}
