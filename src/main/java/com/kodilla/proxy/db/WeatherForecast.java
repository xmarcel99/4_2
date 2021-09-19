package com.kodilla.proxy.db;

import java.util.Random;

public class WeatherForecast implements Forecast{

    private String weatherDescription;

    public WeatherForecast() throws InterruptedException {
        refreshData();
    }

    @Override
    public String getWeather() {
        return weatherDescription;
    }

    @Override
    public String refreshData() throws InterruptedException{
        Thread.sleep(5000);
        int number = new Random().nextInt(3);
        switch (number){
            case 0: weatherDescription = "Sunny";
            case 1: weatherDescription = "Windy";
            case 2: weatherDescription = "Raining";
        }
        return weatherDescription;
    }
}
