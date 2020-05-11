package com.learn.Decorator.Fruit;

import com.learn.Decorator.Sweet.Sweet;

/**
 * 具体装饰器，继承抽象装饰器
 */
public class AppleCake extends FruitCake {
    /**
     * 对于具体装饰器的构造函数，只要默认调用super的即可。
     */
    public AppleCake(Sweet sweet) {
        super(sweet);
    }

    /**
     * 具体装饰器对于被装饰的方法，只需要进行装饰并调用父类的该方法即可。
     */
    @Override
    public void make() {
        System.out.println("Apple");
        super.make();
    }
}
