package org.xander.behavioral.Command;

public class Light {
    private String lightIn;

    public Light(String lightIn) {
        this.lightIn = lightIn;
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}