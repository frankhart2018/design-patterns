package com.company;

public abstract class ShapeDecorator implements Shape {
    private Shape shape;

    public void SetShape(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        if(shape != null) {
            shape.draw();
        }
    }
}

class RedShapeDecorator extends ShapeDecorator {
    public void draw() {
        super.draw();

        System.out.println("Coloring the shape with red color");
        System.out.println("");
    }
}

class GreenShapeDecorator extends ShapeDecorator {
    public void draw() {
        super.draw();

        System.out.println("Coloring the shape with green color");
        System.out.println("");
    }
}
