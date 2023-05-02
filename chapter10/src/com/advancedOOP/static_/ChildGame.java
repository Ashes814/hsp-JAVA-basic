package com.advancedOOP.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("a");
        Child child2 = new Child("b");
        Child child3 = new Child("c");
        child1.join();
        child1.count++;
        child2.join();
        child2.count++;
        child2.count++;
        child3.join();
        child3.count++;
        System.out.println(Child.count);
    }
}

class Child {
    private String name;
    public static int count;
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "join the Game!");
    }
}
