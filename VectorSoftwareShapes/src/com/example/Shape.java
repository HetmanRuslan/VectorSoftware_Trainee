package com.example;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private final double radius;
    double rez;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
      rez= radius * radius * Math.PI;
      return rez;

    }

    @Override
    public String toString() {
        return "Circle(" + (int)this.rez + ")";
    }
}

class Square extends Shape {

    private final double side;
    double rez;
    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        rez=side * side;
        return rez;
    }

    @Override
    public String toString() {
        return "Square(" + this.rez + ")";
    }

}

class Triangle extends Shape{
    private final double base;
    private final double height;
    double rez;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override

    double area() {
        rez=  (base*height)/2;
        return rez;
    }

    @Override
    public String toString() {
        return "Triangle(" + this.rez+ ")";
    }

}
