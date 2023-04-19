package com.pack.polymor.exercise;

public class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }


}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }

}
