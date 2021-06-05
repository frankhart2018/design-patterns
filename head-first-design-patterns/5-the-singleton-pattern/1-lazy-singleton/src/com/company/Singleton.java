package com.company;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("Object created\n");
    }

    // Making this synchronized ensures more than one thread
    // can never enter this method at once
    public static synchronized Singleton getInstance() {
        System.out.println("Get me an object");
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    // But synchronization is expensive
    // And it is only relevant for the first time through this method

    // If performance is key to application then we can create the
    // instance while declaring it as:-
    // private static Singleton = new Singleton()
    // This is called eager instantiation rather than lazy instantiation
    // which is used here
}
