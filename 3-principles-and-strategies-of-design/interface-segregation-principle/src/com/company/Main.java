package com.company;

//interface ShapeInterface {
//    public double area();
//    public double volume(); // Forces all 2D shapes to implement this when it's not needed
//}

interface ShapeInterface {
    public double area();
}

interface SolidShapeInterface {
    public double volume();
}

interface ManagedShapeInterface {
    public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManagedShapeInterface {
    public double area() {
        return 1.0;
    }

    public double volume() {
        return 1.0;
    }

    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements ShapeInterface, ManagedShapeInterface {
    public double area() {
        return 2.0;
    }

    public double calculate() {
        return this.area();
    }
}


public class Main {

    public static void main(String[] args) {
	    // Clients should not be forced to depend upon
        // interfaces that they do not use
        // or a client should not implement an interface if
        // it does not use a method in that interface
    }
}
