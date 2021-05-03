package com.company;

public class Main {

    public static void main(String[] args) {
        // Get an object of circle and call its draw method
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        // Get an object of rectangle and call its draw method
        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        // Get an object of circle and call its draw method
        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
}
