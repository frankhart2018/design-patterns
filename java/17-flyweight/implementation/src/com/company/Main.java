package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] argts) throws Exception{
        RobotFactory myFactory = new RobotFactory();

        Robot shape;

        for(int i = 0; i < 2; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        for(int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nFinally no. of distinct robot objects created = " + numOfDistinctRobots);
    }

    static String getRandomColor() {
        Random r = new Random();

        int random = r.nextInt(20);
        if(random % 2 == 0)
            return "red";
        return "green";
    }
}
