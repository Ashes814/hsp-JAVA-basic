package com.advancedOOP.homework;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework06 {

    public static void main(String[] args) {
        Person ts = new Person("ts", null);
        ts.transport("river");
        ts.transport("road");
        ts.transport("fire mountain");
    }


}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("Horse");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("Boat");
    }
}
class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("Plane");
    }
}

class VehicleFactory {
    public static Horse getHorse() {
        return new Horse();
    }

    public static Plane getPlane() {
        return new Plane();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicle;
    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void transport(String road) {
        if (road.equals("river")) {
           VehicleFactory.getBoat().work();
        } else if (road.equals("fire mountain")) {
            VehicleFactory.getPlane().work();
        }
        else {
            if (!(this.vehicle instanceof Horse)) {
                this.vehicle = VehicleFactory.getHorse();
            }
            this.vehicle.work();
        }
    }


}
