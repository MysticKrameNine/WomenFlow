package com.womehealthapp;

public class WeatherOutfit {
    private String weather;

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String suggestOutfit() {
        if (weather.equals("cold")) {
            return "Wear a warm jacket and boots.";
        } else if (weather.equals("hot")) {
            return "Wear light clothing and sunglasses.";
        } else {
            return "Dress comfortably for the weather.";
        }
    }
}

