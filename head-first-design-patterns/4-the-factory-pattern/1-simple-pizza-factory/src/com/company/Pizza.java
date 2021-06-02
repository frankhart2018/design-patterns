package com.company;

public abstract class Pizza {
    public abstract void prepare();

    public void bake() {
        System.out.println("Baking the pizza!");
    }

    public void cut() {
        System.out.println("Cutting the pizza!");
    }

    public void box() {
        System.out.println("Boxing the pizza!");
    }
}
