package ru.antonovmikhail.shapes;

public record Circle(int r) implements Shape {
    @Override
    public int getShapePerimeter() {
        return (int) Math.round(2 * Math.PI * r);
    }

    @Override
    public int getShapeArea() {
        return (int) Math.round(Math.PI * r * r);
    }
}
