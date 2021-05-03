package com.company;

public abstract class AbstractFactory {
    public abstract HollywoodMovie getHollywoodMovie(String movieType);
    public abstract BollywoodMovie getBollywoodMovie(String movieType);
}

class HollywoodMovieFactory extends AbstractFactory {

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        if(movieType == null)
            return null;
        else if(movieType.equalsIgnoreCase("ACTION"))
            return new HollywoodActionMovie();
        else if(movieType.equalsIgnoreCase("COMEDY"))
            return new HollywoodComedyMovie();

        return null;
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        return null;
    }
}

class BollywoodMovieFactory extends AbstractFactory {

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        return null;
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        if(movieType == null)
            return null;
        else if(movieType.equalsIgnoreCase("ACTION"))
            return new BollywoodActionMovie();
        else if(movieType.equalsIgnoreCase("COMEDY"))
            return new BollywoodComedyMovie();

        return null;
    }
}

// Another way is to create classes for action and comedy which uses the
// get hollywood and bollywood movie methods to return the corresponding movie
// this would be much cleaner than my solution

