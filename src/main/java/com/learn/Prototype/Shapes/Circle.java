package com.learn.Prototype.Shapes;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("画圆");
    }

    public Circle() {
        type = "Circle";
    }
}
