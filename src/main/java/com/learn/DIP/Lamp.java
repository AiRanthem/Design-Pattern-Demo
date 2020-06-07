package com.learn.DIP;

public class Lamp implements Device {

    @Override
    public void TurnOn(){
        System.out.println("灯开了");
    }
    @Override
    public void TurnOff(){
        System.out.println("灯关了");
    }
}
