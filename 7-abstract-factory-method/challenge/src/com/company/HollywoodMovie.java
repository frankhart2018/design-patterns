package com.company;

public interface HollywoodMovie {
    void getMovieName(String movieName);
}

class HollywoodActionMovie implements HollywoodMovie {

    @Override
    public void getMovieName(String movieName) {
        System.out.println(movieName + " is a hollywood action movie.");
    }
}

class HollywoodComedyMovie implements HollywoodMovie {

    @Override
    public void getMovieName(String movieName) {
        System.out.println(movieName + " is a hollywood comedy movie.");
    }
}
