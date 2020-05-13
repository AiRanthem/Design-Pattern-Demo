package com.learn.Decorator;

import com.learn.Decorator.Fruit.AppleCake;
import com.learn.Decorator.Fruit.OrangeCake;
import com.learn.Decorator.Sweet.Cake;
import com.learn.Decorator.Sweet.Sweet;
import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {
    public static void main(String[] args) {
        Sweet cake = new Cake();

        // 透明装饰器
        System.out.println("I'll make an apple cake:");
        Sweet appleCake = new AppleCake(cake);
        appleCake.make();
//        appleCake.addApple(); // 透明装饰器还是原来的对象，不能使用装饰器类的方法

        // 装饰器嵌套
        System.out.println("I'll make a STRANGE cake:");
        Sweet wierdcake = new AppleCake(
                new AppleCake(
                        new AppleCake(
                                new AppleCake(cake)
                        )
                )
        );
        wierdcake.make();

        // 半透明装饰器
        System.out.println("I'll make an orange cake:");
        OrangeCake orangeCake = new OrangeCake(cake);
        orangeCake.addOrange(); // 半透明装饰器是装饰后的对象，可以使用装饰器类的方法
        orangeCake.make();

        AppleCake apple_orange_cake = new AppleCake(orangeCake);
        // 半透明装饰器多次装饰，只能保留最后一次装饰的额外方法，所以半透明多次装饰没有意义
//        apple_orange_cake.addOrange();

    }
}
