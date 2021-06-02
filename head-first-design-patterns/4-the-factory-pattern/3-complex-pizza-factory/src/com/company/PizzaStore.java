package com.company;

public abstract class PizzaStore {
    public Pizza orderPizza(String item) {
        Pizza pizza;

        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("Preparation done!");
        System.out.println(pizza);
        System.out.println();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
