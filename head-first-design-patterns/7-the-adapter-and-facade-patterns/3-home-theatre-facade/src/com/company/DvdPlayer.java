package com.company;

public class DvdPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("DVD player turned on");
    }

    public void off() {
        System.out.println("DVD player turned off");
    }

    public void eject() {
        System.out.println("Eject DVD from DVD player");
    }

    public void pause() {
        System.out.println("Pause DVD player");
    }

    public void play() {
        System.out.println("Play DVD player");
    }

    public void setSurroundAudio() {
        System.out.println("Set surround audio in DVD player");
    }

    public void setTwoChannelAudio() {
        System.out.println("Set two channel audio in DVD player");
    }

    public void stop() {
        System.out.println("Stop DVD player");
    }
}
