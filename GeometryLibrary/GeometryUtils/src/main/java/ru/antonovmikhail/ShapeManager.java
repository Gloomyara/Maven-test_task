package ru.antonovmikhail;


import ru.antonovmikhail.shapes.Circle;
import ru.antonovmikhail.shapes.Rectangle;
import ru.antonovmikhail.shapes.Shape;
import ru.antonovmikhail.shapes.Triangle;

import java.util.Random;

public class ShapeManager {

    public static boolean compareShapeArea(Shape s1, Shape s2) {
        return s1.getShapeArea() > s2.getShapeArea();
    }

    public static boolean compareShapePerimeter(Shape s1, Shape s2) {
        return s1.getShapePerimeter() > s2.getShapePerimeter();
    }

    public static Shape getRandomShape() {
        Random random = new Random();
        int i = random.nextInt(3);
        return switch (i) {
            case 0 -> new Circle(random.nextInt(1, 25));
            case 1 -> new Rectangle(random.nextInt(1, 25), random.nextInt(1, 25));
            case 2 -> new Triangle(random.nextInt(1, 25), random.nextInt(1, 25));
            default -> null;
        };
    }
}
