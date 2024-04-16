package ru.antonovmikhail.shapes;

import lombok.Data;

@Data
public class Rectangle implements Shape {
    private final int a;
    private final int b;

    @Override
    public int getShapePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public int getShapeArea() {
        return a*b;
    }
}
