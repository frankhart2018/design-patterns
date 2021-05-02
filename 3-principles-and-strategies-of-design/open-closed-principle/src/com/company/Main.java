package com.company;

public interface Shape {
    public double calculateArea();
}

class Rectangle {
    public double length;
    public double width;

    public double calculateArea() {
        return length * width;
    }
}

class Circle {
    public double radius;

    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea(); // Giving responsibility to calculate area to the responsible class
    }
}

// This follows open closed principle - open for extension by implementing the interface,
// closed for modification in the AreaCalculator class

public class Main {
    public static void main(String[] args) {

    }
}
