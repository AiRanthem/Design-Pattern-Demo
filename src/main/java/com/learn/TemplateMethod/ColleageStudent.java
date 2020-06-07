package com.learn.TemplateMethod;

public class ColleageStudent extends Person {
    public ColleageStudent() {
        super("大学生");
    }

    @Override
    void breakfast() {

    }

    @Override
    void launch() {
        System.out.println("吃食堂");
    }

    @Override
    void dinner() {
        System.out.println("KFC!!!");
    }

    @Override
    boolean wantEatBreakfast() {
        return false;
    }
}
