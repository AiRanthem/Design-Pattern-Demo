package com.learn.Prototype.Shapes;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("画正方形");
    }

    public Square() {
        type = "Square";
    }
}
