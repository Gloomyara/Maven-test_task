package ru.antonovmikhail.shapes;

import lombok.Data;

@Data
public class Triangle implements Shape {
    //предполагается что треугольник прямоугольный
    private final int a;
    private final int b;

    @Override
    public int getShapePerimeter() {
        int c = (int) Math.round(Math.sqrt(a * a + b * b));
        return a + b + c;
    }

    @Override
    public int getShapeArea() {
        return (a * b) / 2;
    }
}
