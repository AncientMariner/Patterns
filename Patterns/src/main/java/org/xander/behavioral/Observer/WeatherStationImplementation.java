package org.xander.behavioral.Observer;

public class WeatherStationImplementation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("------------------------------");
        weatherData.setMeasurements(82, 70, 28.4f);
        System.out.println("------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
