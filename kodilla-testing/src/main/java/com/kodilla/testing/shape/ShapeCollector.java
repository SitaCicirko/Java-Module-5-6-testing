package com.kodilla.testing.shape;
import java.util.*;
public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();
    void addFigure(Shape shape) {
        shapes.add(shape);
    }
   void removeFigure(Shape shape){
        shapes.remove(shape);
    }
    Shape getFigure(int n){
        return (n >= 0 && n < shapes.size()) ? shapes.get(n) : null;
    }
    String showFigures(){
        String result = " ";
        for (Shape shape : shapes){
            result += shape.getShapeName() + " ";
        }
        return result;
    }
}
