package com.company;

public class Main {

    public static void main(String[] args) {
	    // Get duck object and call talk method
        Animal duck = AnimalFactory.getAnimalType("DUCK");
        duck.talk();

        // Get tiger object and call talk method
        Animal tiger = AnimalFactory.getAnimalType("TIGER");
        tiger.talk();
    }
}
