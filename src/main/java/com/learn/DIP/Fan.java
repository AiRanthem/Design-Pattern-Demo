package com.learn.DIP;

public class Fan implements Device {

    @Override
    public void TurnOn(){
        System.out.println("龙卷风摧毁停车场！");
    }
    @Override
    public void TurnOff(){
        System.out.println("关！");
    }
}
