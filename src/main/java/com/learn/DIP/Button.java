package com.learn.DIP;

public class Button {
    private final Device device;
    volatile boolean on;

    public Button(Device device) {
        this.device = device;
        this.on = false;
    }

    public void Poll(){
        if(on){
            device.TurnOff();
            on = false;
        } else {
            device.TurnOn();
            on = true;
        }
    }
}
