package com.company;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("someFilename.jpg");

        // Image will be loaded from disk
        image.display();
        System.out.println("");

        image.display();
    }
}
