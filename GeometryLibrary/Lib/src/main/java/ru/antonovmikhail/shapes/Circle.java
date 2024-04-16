package ru.antonovmikhail.shapes;

import lombok.Data;

@Data
public class Circle implements Shape {
    private final int r;

    @Override
    public int getShapePerimeter() {
        return (int) Math.round(2 * Math.PI * r);
    }

    @Override
    public int getShapeArea() {
        return (int) Math.round(Math.PI * r * r);
    }
}
