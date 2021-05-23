package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Implemented by Cricket data to communicate to observers
public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}

class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;

    List<Observer> observerList;

    public CricketData() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    // Get latest runs from stadium
    private int getLatestRuns() {
        return 90;
    }

    // Get latest wickets from stadium
    private int getLatestWickets() {
        return 2;
    }

    // Get latest overs from stadium
    private float getLatestOvers() {
        return (float) 10.2;
    }

    // This method is used to update displays when data changes
    public void dataChanged() {
        // Get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}
