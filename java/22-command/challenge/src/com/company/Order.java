package com.company;

public interface Order {
    void execute();
}

class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    public void execute() {
        myStock.buy();
    }
}

class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock myStock) {
        this.myStock = myStock;
    }

    public void execute() {
        myStock.sell();
    }
}