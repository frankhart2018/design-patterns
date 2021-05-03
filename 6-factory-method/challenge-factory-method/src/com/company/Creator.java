package com.company;

interface Animal {
    void talk();
}

class Duck implements Animal {

    @Override
    public void talk() {
        System.out.println("Duck says quack...quack");
    }
}

class Tiger implements Animal {

    @Override
    public void talk() {
        System.out.println("Tiger says roar...roar");
    }
}

public class Creator {
}
