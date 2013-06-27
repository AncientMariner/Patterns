package org.xander.Observer;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float averageTemperature;
    private float minimumTemperature;
    private float maximumTemperature;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\nCurrent statistics: \n###\naverage temperature " + averageTemperature + "F degrees and minimum " + minimumTemperature + "F degrees and maximum " + maximumTemperature);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.averageTemperature = weatherData.getTemperature();
            this.minimumTemperature = weatherData.getTemperature();
            this.maximumTemperature = weatherData.getTemperature();
            display();
        }
    }
}
