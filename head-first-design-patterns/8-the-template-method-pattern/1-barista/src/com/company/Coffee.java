package com.company;

public class Coffee extends CaffeineBeverage {
    public void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
