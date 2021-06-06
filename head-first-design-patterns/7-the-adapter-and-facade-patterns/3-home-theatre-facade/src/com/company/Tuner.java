package com.company;

public class Tuner {
    Amplifier amplifier;

    public void on() {
        System.out.println("Tuner turned on");
    }

    public void off() {
        System.out.println("Tuner turned off");
    }

    public void setAm() {
        System.out.println("AM set in tuner");
    }

    public void setFm() {
        System.out.println("FM set in tuner");
    }

    public void setFrequency() {
        System.out.println("Set frequency in tuner");
    }
}
