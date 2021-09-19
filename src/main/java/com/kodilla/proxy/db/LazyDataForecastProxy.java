package com.kodilla.proxy.db;

public class LazyDataForecastProxy implements Forecast{

    private Forecast forecast;

    @Override
    public String getWeather() throws InterruptedException {
        if(forecast == null) forecast = new WeatherForecast();
        return forecast.getWeather();
    }

    @Override
    public String refreshData() throws InterruptedException {
        if(forecast == null) forecast = new WeatherForecast();
        return forecast.refreshData();
    }
}
