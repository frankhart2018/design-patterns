package com.company;

public class Main {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Top-O-Lne Amplifier");
        Tuner tuner = new Tuner("Top-O-Lin AM/FM Tuner", amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        CdPlayer cdPlayer = new CdPlayer("Top-O-Line CD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);
        TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheaterFacade.watchMovie("Inception");
        homeTheaterFacade.endMovie();
    }
}
