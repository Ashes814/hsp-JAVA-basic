package com.advancedOOP.interface_;

public class Phone implements USB{

    @Override
    public void start() {
        System.out.println("Phone Start");
    }

    @Override
    public void stop() {
        System.out.println("Phone Stop");

    }
}
