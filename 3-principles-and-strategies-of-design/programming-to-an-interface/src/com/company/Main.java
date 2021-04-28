package com.company;

interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements displayModule {
    public void display() {
        System.out.println("Display through Projector");
    }
}

public class Main {
    displayModule dm;

    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Main main = new Main();
        displayModule dm = new Monitor();
        displayModule dm1 = new Projector();

        main.setDisplayModule(dm);
        main.display();
        main.setDisplayModule(dm1);
        main.display();
    }
}
