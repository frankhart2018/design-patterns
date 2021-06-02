package com.company;

public class CaliforniaStyleVeggiePizza extends  Pizza {
    public CaliforniaStyleVeggiePizza() {
        name = "California Style Sun Baked Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void bake() {
        System.out.println("Bake in the sun");
    }
}
