package com.womehealthapp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Initialize features
        CycleTracker cycleTracker = new CycleTracker();
        MoodAdvisor moodAdvisor = new MoodAdvisor();
        WeatherOutfit weatherOutfit = new WeatherOutfit();

        // Sample data for testing
        cycleTracker.setCycleData(28, 1); // Example: 28 days cycle, day 1
        System.out.println(cycleTracker.getCurrentPhase());

        moodAdvisor.setMood("happy");
        System.out.println(moodAdvisor.getAdvice());

        weatherOutfit.setWeather("cold");
        System.out.println(weatherOutfit.suggestOutfit());
    }
}
