package com.company;

abstract class Car implements Cloneable {
    private String id;
    protected String name;
    protected float price = 10.0F;

    abstract void drive();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

class Nano extends Car {
    public Nano() {
        name = "Nano";
        price = 12.99F;
    }

    public Nano(float price) {
        name = "Nano";
        this.price = price;
    }

    @Override
    void drive() {
        System.out.println("Driving Nano of price = " + this.price + ".");
    }
}

class Ford extends Car {
    public Ford() {
        name = "Ford";
        price = 50.99F;
    }

    public Ford(float price) {
        name = "Ford";
        this.price = price;
    }

    @Override
    void drive() {
        System.out.println("Driving Ford of price = " + this.price + ".");
    }
}

public class Main {

    public static void main(String[] args) {
        BasicCarCache.loadCache(56.99F, 99.99F);

        Car nano = (Car) BasicCarCache.getCar("1");
        nano.drive();

        Car priceNano = (Car) BasicCarCache.getCar("2");
        priceNano.drive();

        Car ford = (Car) BasicCarCache.getCar("3");
        ford.drive();

        Car priceFord = (Car) BasicCarCache.getCar("4");
        priceFord.drive();
    }
}
