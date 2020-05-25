package com.learn.Observer;

public class Supporter implements Observer {

    private final String name;

    public Supporter(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("我 %s 同意 %s。", name, message));
    }
}
