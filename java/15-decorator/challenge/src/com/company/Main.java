package com.company;

public class Main {

    public static void main(String[] args) {
	    Rectangle rectangle = new Rectangle();
	    Circle circle = new Circle();

	    RedShapeDecorator redShapeDecorator = new RedShapeDecorator();
	    GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator();

	    // Red rectangle
        redShapeDecorator.SetShape(rectangle);
        redShapeDecorator.draw();

        // Green rectangle
        greenShapeDecorator.SetShape(rectangle);
        greenShapeDecorator.draw();

        // Red circle
        redShapeDecorator.SetShape(circle);
        redShapeDecorator.draw();

        // Green circle
        greenShapeDecorator.SetShape(circle);
        greenShapeDecorator.draw();
    }
}
