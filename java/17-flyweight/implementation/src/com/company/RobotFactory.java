package com.company;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot = null;

        if(shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have a king robot, so we are creating a king robot.");
                    myRobot = new Robot("King");
                    shapes.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have a queen robot, so we are creating a queen robot.");
                    myRobot = new Robot("Queen");
                    shapes.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception("Robot factory can create only king and queen shapes");
            }
        }

        return myRobot;
    }
}