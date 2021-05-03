package com.company;

public abstract class AbstractFactory {
    // This is bad design because the classes that implement this abstract class
    // will only care about one of them, but it will have to implement both
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null)
            return null;
        else if(shape.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if(shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null)
            return null;
        else if(color.equalsIgnoreCase("RED"))
            return new Red();
        else if(color.equalsIgnoreCase("GREEN"))
            return new Green();
        else if(color.equalsIgnoreCase("BLUE"))
            return new Blue();

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}