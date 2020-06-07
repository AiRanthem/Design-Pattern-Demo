package com.learn.TemplateMethod;

public abstract class Person {
    // 个人信息
    private String name;

    // 三餐的行为
    abstract void breakfast();

    abstract void launch();

    abstract void dinner();

    // 早餐的钩子函数
    abstract boolean wantEatBreakfast();

    public final void day() {
        System.out.println("我是" + name);
        System.out.println("早上了.");
        if (wantEatBreakfast()) {
            breakfast();
        } else {
            System.out.println("我早饭没吃.");
        }
        System.out.println("中午了.");
        launch();
        System.out.println("晚上了.");
        dinner();
    }

    public Person(String name) {
        this.name = name;
    }
}
