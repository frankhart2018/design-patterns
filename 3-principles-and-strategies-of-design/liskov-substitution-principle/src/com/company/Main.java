package com.company;

class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle {
    int getSpeed() {}
    int getCubicCapacity() {}
    boolean sHatchBack() {}
}

class Bus extends Vehicle {
    int getSpeed() {}
    int getCubicCapacity() {}
    String getEmergencyExitLoc() {}
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        vehicle.getCubicCapacity();

        // This follows Liskov Substitution Principle - sub type objects
        // can replace super type objects without affecting the functionality
        // inherent in the super type
    }
}
