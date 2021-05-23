package com.company;

public class Main {

    public static void main(String[] args) {
        // Create objects for testing
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // Pass the displays to cricket data
        CricketData cricketData = new CricketData();

        // Register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        // In real app we would have some logic to call this function when data changes
        cricketData.dataChanged();

        // Remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        // Now only currentScoreDisplay gets the notification
        cricketData.dataChanged();
    }
}
