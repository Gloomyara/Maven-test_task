package ru.antonovmikhail;

import lombok.Data;

@Data
public class Cube implements ThreeDimShape {

    private final int a;

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
