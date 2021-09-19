package com.kodilla.proxy;

import com.kodilla.proxy.db.*;

import java.util.Random;

public class ProxyApp {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            Forecast weatherForecast = new LazyDataForecastProxy();
            int number = new Random().nextInt(100);
            if (number < 20) {
                System.out.println(weatherForecast.getWeather());
            } else {
                System.out.println("Execution #" + n + " just finished");
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
