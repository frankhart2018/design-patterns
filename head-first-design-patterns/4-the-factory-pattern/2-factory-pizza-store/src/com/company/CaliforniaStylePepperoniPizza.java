package com.company;

public class CaliforniaStylePepperoniPizza extends  Pizza {
    public CaliforniaStylePepperoniPizza() {
        name = "California Style Sun Baked Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void bake() {
        System.out.println("Bake in the sun");
    }
}
