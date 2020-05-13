package com.learn.Decorator.Fruit;

import com.learn.Decorator.Sweet.Sweet;

public class OrangeCake extends FruitCake {
    public OrangeCake(Sweet sweet) {
        super(sweet);
    }

    @Override
    public void make() {
        super.make();
    }

    public void addOrange(){
        System.out.println("Orange");
    }
}
