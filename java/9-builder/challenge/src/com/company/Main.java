package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("****Meal Pattern Demo***\n");

        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();

        // Making veg meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");;
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost() + "\n");

        // Making non-veg meal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
    }
}