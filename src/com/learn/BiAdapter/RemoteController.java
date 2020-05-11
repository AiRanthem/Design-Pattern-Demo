package com.learn.BiAdapter;

import com.learn.DIP.Device;

public class RemoteController {
    Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    public void TurnOn(){
        device.TurnOn();
    }

    public void TurnOff(){
        device.TurnOff();
    }
}
