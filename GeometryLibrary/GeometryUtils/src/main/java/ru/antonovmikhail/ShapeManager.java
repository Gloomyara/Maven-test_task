package ru.antonovmikhail;


import ru.antonovmikhail.shapes.Shape;

public class ShapeManager {

    public static int compareShapeArea(Shape s1, Shape s2) {
        return s1.getShapeArea() - s2.getShapeArea();
    }

    public static int compareShapePerimeter(Shape s1, Shape s2) {
        return s1.getShapePerimeter() - s2.getShapePerimeter();
    }
}
