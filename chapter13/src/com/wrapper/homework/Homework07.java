package com.wrapper.homework;

import java.util.ArrayList;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", 400000);
        Car ferrari = new Car("ferrari", 5000000);


        ArrayList carList = new ArrayList();
        carList.add(bmw);
        carList.add(ferrari);
        System.out.println(carList);
        carList.remove(bmw);
        System.out.println(carList);
        System.out.println(carList.contains(bmw));

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
