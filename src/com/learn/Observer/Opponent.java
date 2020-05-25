package com.learn.Observer;

public class Opponent implements Observer {
    private final String name;

    public Opponent(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("我 %s 反对 %s！",name, message));
    }
}
