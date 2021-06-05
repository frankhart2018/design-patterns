package com.company;

public class Light {
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Light in " + room + " is on");
    }

    public void off() {
        System.out.println("Light in " + room + " is off");
    }
}
