package com.learn.TemplateMethod;

public class SiChuanRen extends Person {

    public SiChuanRen() {
        super("四川人");
    }

    @Override
    void breakfast() {
        System.out.println("吃花椒粽子");
    }

    @Override
    void launch() {
        System.out.println("吃辣子鸡");
    }

    @Override
    void dinner() {
        System.out.println("吃火锅!");
    }

    @Override
    boolean wantEatBreakfast() {
        return true;
    }
}
