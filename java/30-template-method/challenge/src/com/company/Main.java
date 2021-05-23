package com.company;

public class Main {

    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(false);
    }
}
