package com.learn.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CounterFactory counterFactory = new CounterFactory();
        Counter counter1 = counterFactory.getCounter(1);
        counter1.count();
        Counter counter2 = counterFactory.getCounter(2);
        counter2.count();
        Counter counter3 = counterFactory.getCounter(1);
        counter3.count();

        System.out.printf("%d, %d, %d \n", counter1.getNumber(), counter2.getNumber(), counter3.getNumber());
    }
}
