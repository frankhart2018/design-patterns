package com.company;

public class FactoryProducer {
    public static AbstractFactory getMovieFactory(String movieFactoryName) {
        if(movieFactoryName == null)
            return null;
        else if(movieFactoryName.equalsIgnoreCase("HOLLYWOOD"))
            return new HollywoodMovieFactory();
        else if(movieFactoryName.equalsIgnoreCase("BOLLYWOOD"))
            return new BollywoodMovieFactory();

        return null;
    }
}
