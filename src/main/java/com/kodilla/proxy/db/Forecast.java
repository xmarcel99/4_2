package com.kodilla.proxy.db;

public interface Forecast {

    String getWeather() throws InterruptedException;
    String refreshData() throws InterruptedException;
}
