package com.learn.Prototype.Shapes;

public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("画三角形");
    }

    public Rectangle() {
        type="Rectangle";
    }
}
