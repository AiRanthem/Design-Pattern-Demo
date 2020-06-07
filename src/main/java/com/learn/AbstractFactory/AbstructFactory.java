package com.learn.AbstractFactory;

import com.learn.AbstractFactory.Colors.Color;
import com.learn.AbstractFactory.Shapes.Shape;

public interface AbstructFactory {
    Color getColor();
    Shape getShape();
}
