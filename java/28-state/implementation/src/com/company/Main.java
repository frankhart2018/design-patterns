package com.company;

public class Main {

    public static void main(String[] args) {
        // Initially TV is Off
        Off initialState = new Off();

        TV tv = new TV(initialState);

        // First time press
        tv.pressButton();

        // Second time press
        tv.pressButton();
    }
}
