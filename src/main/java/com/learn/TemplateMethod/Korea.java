package com.learn.TemplateMethod;

public class Korea extends Person {
    public Korea() {
        super("韩国人");
    }

    @Override
    void breakfast() {
        System.out.println("吃泡菜!");
    }

    @Override
    void launch() {
        System.out.println("吃泡菜!");
    }

    @Override
    void dinner() {
        System.out.println("吃泡菜!");
    }

    @Override
    boolean wantEatBreakfast() {
        return true;
    }
}
