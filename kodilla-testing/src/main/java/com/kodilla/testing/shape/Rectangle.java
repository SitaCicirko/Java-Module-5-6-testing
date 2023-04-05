package com.kodilla.testing.shape;

public class Rectangle implements Shape{
    int a;
    int b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public String getShapeName() {
        return "rectangle";
    }
    @Override
    public double getField() {
        return a * b;
    }
}
