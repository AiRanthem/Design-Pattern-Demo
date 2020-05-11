package com.learn.BiAdapter;

public class BiAdapter implements Cat, Dog {
    private Cat cat;
    private Dog dog;

    public BiAdapter(Dog dog) {
        this.dog = dog;
    }

    public BiAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void meow() {
        dog.bark();
    }

    @Override
    public void bark() {
        cat.meow();
    }
}
