package com.company;

public class AnimalFactory {

    public static Animal getAnimalType(String animalType) {
        if(animalType == null)
            return null;
        else if(animalType.equalsIgnoreCase("DUCK"))
            return new Duck();
        else if(animalType.equalsIgnoreCase("TIGER"))
            return new Tiger();

        return null;
    }
}
