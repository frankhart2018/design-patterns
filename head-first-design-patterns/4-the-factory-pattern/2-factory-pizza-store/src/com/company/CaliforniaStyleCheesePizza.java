package com.company;

public class CaliforniaStyleCheesePizza extends  Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Sun Baked Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void bake() {
        System.out.println("Bake in the sun");
    }
}
