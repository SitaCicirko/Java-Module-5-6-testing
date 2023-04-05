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
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes){
            sb.append(shape.getShapeName()).append(" ");
        }
        return sb.toString().trim();
    }
}
