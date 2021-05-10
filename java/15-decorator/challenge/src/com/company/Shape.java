package com.company;

public interface Shape {
    public void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
