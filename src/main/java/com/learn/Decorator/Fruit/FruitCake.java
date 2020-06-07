package com.learn.Decorator.Fruit;

import com.learn.Decorator.Sweet.Sweet;

/**
 * 抽象装饰器
 * 水果是装饰器。把各种水果放到甜品上。
 */
public abstract class FruitCake implements Sweet { // 1、装饰器需要继承组件
    // 2、装饰器依赖构件，需要有一个引用。
    Sweet sweet;

    // 3、实现装饰的核心：构造函数。通过不停的构造来不停的装饰。
    public FruitCake(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public void make() {
        // 4、委托给构件工作
        sweet.make();
    }
}
