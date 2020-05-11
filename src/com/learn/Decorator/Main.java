package com.learn.Decorator;

import com.learn.Decorator.Fruit.AppleCake;
import com.learn.Decorator.Fruit.OrangeCake;
import com.learn.Decorator.Sweet.Cake;
import com.learn.Decorator.Sweet.Sweet;
import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println("I'll make a simple cake:");
        cake.make();

        System.out.println("I'll make an apple cake:");
        AppleCake appleCake = new AppleCake(cake);
        appleCake.make();

        System.out.println("I'll make an orange cake:");
        OrangeCake orangeCake = new OrangeCake(cake);
        orangeCake.make();

        System.out.println("I'll make a remix cake:");
        AppleCake appleCake1 = new AppleCake(new OrangeCake(cake));
        appleCake1.make();

        System.out.println("I'll make a STRANGE cake:");
        Sweet wierdcake = new AppleCake(
                new OrangeCake(
                        new AppleCake(
                                new OrangeCake(cake)
                        )
                )
        );
        wierdcake.make();
    }
}
