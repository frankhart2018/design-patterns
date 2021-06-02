package com.company;

public class ChicagoStylePepperoniPizza extends  Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicacgo Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
