package com.pack.polymor;

public class Cat extends Animal {
    public String nae = "8848";

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("cat");
        return nae;
    }
}
