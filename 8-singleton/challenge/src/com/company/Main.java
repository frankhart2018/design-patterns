package com.company;

class SingletonCaptain {
    private SingletonCaptain() {
        System.out.println("New Captain selected for our team.");
    }

    private static class SingletonHelper {
        private static final SingletonCaptain uniqueInstance = new SingletonCaptain();
    }

    public static SingletonCaptain getInstance() {
        return SingletonHelper.uniqueInstance;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");

        System.out.println("Trying to make a caption for our team.");
        SingletonCaptain captain = SingletonCaptain.getInstance();

        System.out.println("Trying to make another cation for our team.");
        SingletonCaptain anotherCaptain = SingletonCaptain.getInstance();

        if(captain == anotherCaptain)
            System.out.println("c1 and c2 are same instance");
    }
}
