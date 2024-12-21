package com.womehealthapp;

public class MoodAdvisor {
    private String mood;

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getAdvice() {
        if (mood.equals("happy")) {
            return "Keep spreading positivity!";
        } else if (mood.equals("stressed")) {
            return "Take a deep breath and relax.";
        } else {
            return "Stay strong!";
        }
    }
}

