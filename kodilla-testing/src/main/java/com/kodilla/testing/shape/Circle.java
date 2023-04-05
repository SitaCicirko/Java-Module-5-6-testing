package com.kodilla.testing.shape;

public class Circle implements Shape{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public String getShapeName() {
        return "circle";
    }
    @Override
    public double getField() {
        return Math.PI * radius * radius;
    }
}
