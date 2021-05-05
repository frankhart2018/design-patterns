package com.company;

public class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder) {
        myBuilder = builder;
        builder.buildBurger();
        builder.buildDrink();
    }
}
