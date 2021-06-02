package com.company;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("Preparation done!\n");

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
