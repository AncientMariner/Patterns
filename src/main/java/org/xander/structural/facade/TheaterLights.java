package org.xander.structural.facade;

public class TheaterLights {
    public void on() {
        System.out.println("Turning on the theater lights");
    }

    public void dim(int intensity) {
        System.out.println("Dimming theater lights to " + intensity + "% intensity");
    }
}