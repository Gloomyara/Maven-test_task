package ru.antonovmikhail.shapes;

/**
 * @param a предполагается что треугольник прямоугольный
 */
public record Triangle(int a, int b) implements Shape {
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
