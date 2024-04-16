package ru.antonovmikhail;

import ru.antonovmikhail.shapes.Circle;
import ru.antonovmikhail.shapes.Rectangle;
import ru.antonovmikhail.shapes.Shape;
import ru.antonovmikhail.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 4);
        System.out.printf("Длина 2д окружности: %d;\n Площадь: %d; \n",
                circle.getShapePerimeter(), circle.getShapeArea());
        System.out.printf("Периметр 2д прямоугольника: %d;\n Площадь: %d; \n",
                rectangle.getShapePerimeter(), rectangle.getShapeArea());
        System.out.printf("Периметр 2д треугольника: %d;\n Площадь: %d; \n",
                triangle.getShapePerimeter(), triangle.getShapeArea());
    }

}