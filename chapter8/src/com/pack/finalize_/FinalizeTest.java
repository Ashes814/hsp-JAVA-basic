package com.pack.finalize_;

public class FinalizeTest {
    public static void main(String[] args) {


        Car tesla = new Car("特斯拉");
        tesla = null;
        System.gc();

        System.out.println("Exit!");
    }
}


class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage ！");
    }
}