package com.learn.Decorator.Fruit;

import com.learn.Decorator.Sweet.Sweet;

public class OrangeCake extends FruitCake {
    public OrangeCake(Sweet sweet) {
        super(sweet);
    }

    @Override
    public void make() {
        System.out.println("Orange");
        super.make();
    }
}
