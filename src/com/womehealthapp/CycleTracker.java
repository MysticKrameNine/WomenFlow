package com.womehealthapp;

public class CycleTracker {
    private  int cycleLength; // Length of the cycle : e.g., 28 days)
    private int currentDay; // The current day of the cycle

    public CycleTracker(int cycleLength, int currentDay){
        this.cycleLength = cycleLength;
        this.currentDay = currentDay;
    }

    public void setCycleLength(int cycleLength, int currentDay) {
        this.cycleLength = cycleLength;
        this.currentDay = currentDay;
    }

    public String getCurrentPhase() {
        if (currentDay <= cycleLength/2){
            return "Follicular Phase";
        }
        else {
            return "Luteal Phase";
        }

}
}
