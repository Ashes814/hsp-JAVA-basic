package com.advancedOOP.interface_;

public class Camera implements USB{
    @Override
    public void start() {
        System.out.println("Camera Start");
    }

    @Override
    public void stop() {
        System.out.println("Camera Stop");

    }
}
