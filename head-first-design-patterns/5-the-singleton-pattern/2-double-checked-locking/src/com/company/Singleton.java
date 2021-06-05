package com.company;

public class Singleton {
    // The volatile keyword ensures that multiple threads
    // handle the uniqueInstance variable correctly when it
    // is being initialized to the Singleton instance
    private volatile static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("Object created\n");
    }

    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            // Syncrhonizing only the first time through
            synchronized (Singleton.class) {
                // Once inside this block if it is still null then create the instance
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
