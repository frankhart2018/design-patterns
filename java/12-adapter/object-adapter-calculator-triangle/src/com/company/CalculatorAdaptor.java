package com.company;

public class CalculatorAdaptor implements CalculatorInterface {
    Calculator calculator;
    Triangle t;

    public CalculatorAdaptor(Triangle myTriangle) {
        t = myTriangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();

        Rectangle rectangle = new Rectangle();

        rectangle.length = t.base;
        rectangle.width = 0.5 * t.height;

        return calculator.getArea(rectangle);
    }
}
