package com.company;

public class CaliforniaStyleClamPizza extends  Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Sun Baked Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void bake() {
        System.out.println("Bake in the sun");
    }
}
