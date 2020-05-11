package com.learn.Bridge;

import com.learn.Bridge.Car.BMW;
import com.learn.Bridge.Car.BenZ;
import com.learn.Bridge.Car.Car;
import com.learn.Bridge.Gear.Auto;
import com.learn.Bridge.Gear.Gear;
import com.learn.Bridge.Gear.Manual;

public class Main {
    /**
     * 现在我需要使用一个自动挡宝马和手动档奔驰
     */
    public static void main(String[] args) {
        Car bmw = new BMW();
        Car benz = new BenZ();
        Gear auto = new Auto();
        Gear manual = new Manual();

        bmw.setGear(auto); // 这就是一个桥接过程
        bmw.run();

        benz.setGear(manual);
        benz.run();
    }
}
