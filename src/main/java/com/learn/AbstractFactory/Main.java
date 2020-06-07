package com.learn.AbstractFactory;

import com.learn.AbstractFactory.Colors.Color;
import com.learn.AbstractFactory.Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        AbstructFactory redSquare = new RedSquare();
        Color color = redSquare.getColor();
        Shape shape = redSquare.getShape();
        shape.draw();
        color.fill();
    }
}
