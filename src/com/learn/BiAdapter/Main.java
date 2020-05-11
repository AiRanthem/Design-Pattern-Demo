package com.learn.BiAdapter;

public class Main {
    public static void main(String[] args) {
        Cat fakecat = new BiAdapter(new Puppy());
        Dog fakedog = new BiAdapter(new Catty());

        System.out.println("我是一只猫，我会喵喵叫，不信你听：");
        fakecat.meow();

        System.out.println("我是一只狗，我会汪汪叫，不信你听：");
        fakedog.bark();
    }
}
