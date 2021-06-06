package com.company;

public class Projector {
    DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector turned on");
    }

    public void off() {
        System.out.println("Projector turned off");
    }

    public void tvMode() {
        System.out.println("Projector switched to TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector switched to wide screen mode");
    }
}
