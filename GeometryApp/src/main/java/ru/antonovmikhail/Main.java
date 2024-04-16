package ru.antonovmikhail;

import ru.antonovmikhail.shapes.Circle;
import ru.antonovmikhail.shapes.Rectangle;
import ru.antonovmikhail.shapes.Shape;
import ru.antonovmikhail.shapes.Triangle;

import static ru.antonovmikhail.ShapeManager.compareShapeArea;
import static ru.antonovmikhail.ShapeManager.getRandomShape;

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
        System.out.println("Площадь a больше площади б?:" + compareShapeArea(circle, rectangle));
        System.out.println("\n Немного случайных фигур:");
        for (int i = 0; i < 5; i++) {
            Shape shape = getRandomShape();
            if (shape instanceof Circle) {
                System.out.printf("Длина 2д окружности: %d;\n Площадь: %d; \n",
                        shape.getShapePerimeter(), shape.getShapeArea());
            } else if (shape instanceof Triangle) {
                System.out.printf("Периметр 2д треугольника: %d;\n Площадь: %d; \n",
                        shape.getShapePerimeter(), shape.getShapeArea());
            } else if (shape instanceof Rectangle) {
                System.out.printf("Периметр 2д прямоугольника: %d;\n Площадь: %d; \n",
                        shape.getShapePerimeter(), shape.getShapeArea());
            } else if (shape instanceof Cube threeDimShape) {
                System.out.printf("Периметр 3д куба: %d;\n Площадь: %d; \n Обьем: %d \n",
                        threeDimShape.getShapePerimeter(), threeDimShape.getShapeArea(), threeDimShape.getShapeVolume());
            } else if (shape instanceof Sphere threeDimShape) {
                System.out.printf("Длина 3д окружности: %d;\n Площадь: %d; \n Обьем: %d \n",
                        threeDimShape.getShapePerimeter(), threeDimShape.getShapeArea(), threeDimShape.getShapeVolume());
            } else {
                System.out.println("Что-то пошло не так");
            }
        }
        ThreeDimShape cube = new Cube(5);
        System.out.printf("Периметр 3д куба: %d;\n Площадь: %d; \n Обьем: %d \n",
                cube.getShapePerimeter(), cube.getShapeArea(), cube.getShapeVolume());
        ThreeDimShape sphere = new Sphere(5);
        System.out.printf("Длина 3д окружности: %d;\n Площадь: %d; \n Обьем: %d \n",
                sphere.getShapePerimeter(), sphere.getShapeArea(), sphere.getShapeVolume());
        System.out.println("Площадь a больше площади б?:" + compareShapeArea(circle, sphere));
        System.out.println("Площадь a больше площади б?:" + compareShapeArea(rectangle, cube));
    }

}