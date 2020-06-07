package com.learn.FactoryMethod;

public class Counter {
    private final int id;     // 编号
    private int number;       // 计数

    public Counter(int id) {
        this.id = id;
        this.number = 0;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void count(){
        number++;
    }
}
