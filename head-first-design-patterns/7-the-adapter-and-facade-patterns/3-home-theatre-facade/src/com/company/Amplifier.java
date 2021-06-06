package com.company;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier turned on");
    }

    public void off() {
        System.out.println("Amplifier turned off");
    }

    public void setCd() {
        System.out.println("CD set in amplifier");
    }

    public void setDvd() {
        System.out.println("DVD set in amplifier");
    }

    public void setStereoSound() {
        System.out.println("Set stereo sound in amplifier");
    }

    public void setSurroundSound() {
        System.out.println("Set surround sound in amplifier");
    }

    public void setTuner() {
        System.out.println("Set tuner in amplifier");
    }

    public void setVolume() {
        System.out.println("Set volume in amplifier");
    }
}
