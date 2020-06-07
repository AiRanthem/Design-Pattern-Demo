package com.learn.Prototype;

import com.learn.Prototype.Shapes.Circle;
import com.learn.Prototype.Shapes.Rectangle;
import com.learn.Prototype.Shapes.Shape;
import com.learn.Prototype.Shapes.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> cache =
            new Hashtable<>();

    public static Shape getShape(String key) {
        Shape shape = cache.get(key);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
        Shape shape = new Circle();
        shape.setId("circle1");
        cache.put(shape.getId(),shape);

        shape = new Rectangle();
        shape.setId("rect1");
        cache.put(shape.getId(),shape);

        shape = new Square();
        shape.setId("square1");
        cache.put(shape.getId(),shape);
    }
}
