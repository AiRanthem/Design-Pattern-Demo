package com.learn.Bridge.Car;

public class BMW extends Car {
    @Override
    public void run() {
        gear.gear();
        System.out.println("BMW car running");
    }
}
