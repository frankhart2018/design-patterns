package com.company;

public class Main {

    public static void main(String[] args) {
	    Triangle t = new Triangle(20, 10);

	    CalculatorInterface calculatorAdaptor = new CalculatorAdaptor(t);

        System.out.println("Area of triangle is: " + calculatorAdaptor.getArea(null));
    }
}
