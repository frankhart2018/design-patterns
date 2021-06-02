package com.company;

public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        Pizza veggiePizza = pizzaStore.orderPizza("veggie");
        Pizza clamPizza = pizzaStore.orderPizza("clam");
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}
