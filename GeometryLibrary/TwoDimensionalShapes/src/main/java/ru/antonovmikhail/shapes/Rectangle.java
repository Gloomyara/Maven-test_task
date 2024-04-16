package ru.antonovmikhail.shapes;

public record Rectangle(int a, int b) implements Shape {
    @Override
    public int getShapePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public int getShapeArea() {
        return a * b;
    }
}
