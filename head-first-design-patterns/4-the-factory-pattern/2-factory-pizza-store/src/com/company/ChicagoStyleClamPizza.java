package com.company;

public class ChicagoStyleClamPizza extends  Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicacgo Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
