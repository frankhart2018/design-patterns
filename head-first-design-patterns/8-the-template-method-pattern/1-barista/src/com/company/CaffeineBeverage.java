package com.company;

public abstract class CaffeineBeverage {
    // This is the "template method" - core of template method pattern
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments())
            addCondiments();

        System.out.println();
    };

    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pour into cup");
    }

    // This is the hook method, this can control the algorithm
    boolean customerWantsCondiments() {
        return true;
    }
}
