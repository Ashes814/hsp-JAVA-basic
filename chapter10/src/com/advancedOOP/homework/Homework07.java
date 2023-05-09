package com.advancedOOP.homework;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(-10);
        Car car1 = new Car(24);
        Car car2 = new Car(50);
        car.getAir().flow();
        car1.getAir().flow();
        car2.getAir().flow();

    }
}


class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow () {
            if (temperature > 40) {
                System.out.println("Cold Air");
            } else if (temperature < 0) {
                System.out.println("Hot Air");
            } else {
                System.out.println("Turn off");
            }

        }
    }

    public Air getAir() {
        return new Air();
    }
}

