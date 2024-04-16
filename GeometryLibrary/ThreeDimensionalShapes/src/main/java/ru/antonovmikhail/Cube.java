package ru.antonovmikhail;

public record Cube(int a) implements ThreeDimShape {

    @Override
    public int getShapePerimeter() {
        return a * 24;
    }

    @Override
    public int getShapeArea() {
        return a * a * 6;
    }

    @Override
    public int getShapeVolume() {
        return a * a * a;
    }
}
