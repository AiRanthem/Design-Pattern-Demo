package com.learn.Bridge.Car;

public class BenZ extends Car {

    @Override
    public void run() {
        gear.gear();
        System.out.println("BenZ Car running");
    }
}
