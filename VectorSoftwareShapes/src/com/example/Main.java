package com.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(12,2));
        shapes.add(new Circle(6));
        shapes.add(new Square(14));
        shapes.add(new Square(11));
        shapes.add(new Circle(6));
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.area(), o2.area());
            }
        });
        System.out.println(shapes);

    }
}
