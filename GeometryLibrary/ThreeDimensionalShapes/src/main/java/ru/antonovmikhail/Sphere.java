package ru.antonovmikhail;

import lombok.Data;

@Data
public class Sphere implements ThreeDimShape {

    private final int r;

    @Override
    public int getShapePerimeter() {
        return (int) Math.round(2 * Math.PI * r);
    }

    @Override
    public int getShapeArea() {
        return (int) Math.round(4 * Math.PI * r * r);
    }

    @Override
    public int getShapeVolume() {
        return (int) Math.round((4 * Math.PI * r * r * r)/3);
    }
}
