package com.company;

public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Stereo in " + room + " is on");
    }

    public void off() {
        System.out.println("Stereo in " + room + " is off");
    }

    public void setCd() {
        System.out.println("Set CD in stereo");
    }

    public void setDvd() {
        System.out.println("Set DVD in stereo");
    }

    public void setRadio() {
        System.out.println("Stero set to radio mode");
    }

    public void setVolume(int volume) {
        System.out.println("Stero's volume set to " + volume);
    }
}
