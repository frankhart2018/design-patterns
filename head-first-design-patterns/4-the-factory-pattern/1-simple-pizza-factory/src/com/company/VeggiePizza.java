package com.company;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing a veggie pizza!");
    }
}
