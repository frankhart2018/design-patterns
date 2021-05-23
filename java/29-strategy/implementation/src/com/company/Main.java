package com.company;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay by PayPal
        cart.pay(new PaypalStrategy("jason@gmail.com", "mypassword"));

        // Pay by credit cad
        cart.pay(new CreditCardStrategy("Jason Fedin", "22222222222222222", "444", "12/15"));
    }
}
