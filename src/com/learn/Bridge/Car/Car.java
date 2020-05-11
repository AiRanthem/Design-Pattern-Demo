package com.learn.Bridge.Car;

import com.learn.Bridge.Gear.Gear;

/**
 * 抽象车，定义车的最基本信息：品牌和变速，
 */
public abstract class Car {
    protected Gear gear;

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public abstract void run();
}
