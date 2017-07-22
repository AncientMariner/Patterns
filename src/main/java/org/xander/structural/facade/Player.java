package org.xander.structural.facade;

public class Player {
    public void on() {
        System.out.println("Turning on the player");
    }

    public void off() {
        System.out.println("Turning off the player");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie + " today\nEnjoy");
    }

    public void stop() {
        System.out.println("Stopping the player");
    }
}