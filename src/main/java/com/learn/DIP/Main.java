package com.learn.DIP;

import com.learn.BiAdapter.RemoteController;

public class Main {
    public static void thirdtry(){
        Device lamp = new Lamp();
        RemoteController remoteController = new RemoteController(lamp);
        System.out.println("按一下开");
        remoteController.TurnOn();
        System.out.println("按一下关");
        remoteController.TurnOff();
        System.out.println("再按一下开");
        remoteController.TurnOn();
        System.out.println("再按一下关");
        remoteController.TurnOff();
    }
    public static void main(String[] args) {
        thirdtry();
    }
}
