package com.company;

public class CdPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("CD player turned on");
    }

    public void off() {
        System.out.println("CD player turned off");
    }

    public void eject() {
        System.out.println("Eject CD from CD player");
    }

    public void pause() {
        System.out.println("Pause CD player");
    }

    public void play() {
        System.out.println("Play CD player");
    }

    public void stop() {
        System.out.println("Stop CD player");
    }
}
