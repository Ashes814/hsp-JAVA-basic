package com.pack.ext.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("5900x", "DDR5 128G", "Samsung: 1T", "Lenovo");
        NotePad notepad = new NotePad("12900k", "DDR5 32G", "Xiaomi: 8T", "red");
        pc.getDetails();
        notepad.getDetails();

        System.out.println(pc.getBrand());
        System.out.println(notepad.getColor());


    }
}


class Computer {
    private String cpu;
    private String ram;
    private String store;

    public Computer() {
    }

    public Computer(String cpu, String ram, String store) {
        this.cpu = cpu;
        this.ram = ram;
        this.store = store;
    }

    public void getDetails() {
        System.out.println("CPU: " + this.cpu + " RAM: " + this.ram + " Store: " + this.store);

    }
}

class PC extends Computer {
    private String brand;

    public PC(String cpu, String ram, String store, String brand) {
        super(cpu, ram, store);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, String ram, String store, String color) {
        super(cpu, ram, store);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}

