package com.company;

public interface BollywoodMovie {
    void getMovieName(String movieName);
}

class BollywoodActionMovie implements BollywoodMovie {

    @Override
    public void getMovieName(String movieName) {
        System.out.println(movieName + " is a bollywood action movie.");
    }
}

class BollywoodComedyMovie implements BollywoodMovie {

    @Override
    public void getMovieName(String movieName) {
        System.out.println(movieName + " is a bollywood comedy movie.");
    }
}
