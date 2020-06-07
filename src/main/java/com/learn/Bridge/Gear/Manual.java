package com.learn.Bridge.Gear;

/**
 * 手动挡
 */
public class Manual extends Gear {
    @Override
    public void gear() {
        System.out.println("Powered By Manual Gear...");
    }
}
