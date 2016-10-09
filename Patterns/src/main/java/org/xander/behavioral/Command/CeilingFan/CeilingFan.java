package org.xander.behavioral.Command.CeilingFan;

public class CeilingFan {
    public static final int HIGH = 10;
    public static final int MEDIUM = 5;
    public static final int LOW = 3;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling Fan in " + location + " is on high");

    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan in " + location + " is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling Fan in " + location + " is on low");

    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling Fan in " + location + " is on off");

    }

    public int getSpeed() {
        return speed;
    }
}