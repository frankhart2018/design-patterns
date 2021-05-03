package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractFactory hollywoodFactory = FactoryProducer.getMovieFactory("HOLLYWOOD");

        HollywoodMovie hollywoodActionMovie = hollywoodFactory.getHollywoodMovie("ACTION");
        hollywoodActionMovie.getMovieName("Mission Impossible: Ghost Protocol");

        HollywoodMovie hollywoodComedyMovie = hollywoodFactory.getHollywoodMovie("COMEDY");
        hollywoodComedyMovie.getMovieName("The Hangover");

        AbstractFactory bollywoodFactory = FactoryProducer.getMovieFactory("BOLLYWOOD");

        BollywoodMovie bollywoodActionMovie = bollywoodFactory.getBollywoodMovie("ACTION");
        bollywoodActionMovie.getMovieName("Dhoom 2");

        BollywoodMovie bollywoodComedyMovie = bollywoodFactory.getBollywoodMovie("COMEDY");
        bollywoodComedyMovie.getMovieName("Dhamaal");
    }
}
