package com.learn.AbstractFactory;

import com.learn.AbstractFactory.Colors.Color;
import com.learn.AbstractFactory.Colors.Red;
import com.learn.AbstractFactory.Shapes.Shape;
import com.learn.AbstractFactory.Shapes.Square;

public class RedSquare implements AbstructFactory {
    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public Shape getShape() {
        return new Square();
    }
}
