package com.learn.Bridge.Car;

/**
 * 奔驰的实现类
 */
public class BenZ extends Car {

    @Override
    public void run() {
        gear.gear();
        System.out.println("BenZ Car running");
    }
}
