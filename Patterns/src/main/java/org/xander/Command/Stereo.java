package org.xander.Command;

public class Stereo {
    private String stereoIn;

    public Stereo(String stereoIn) {
        this.stereoIn = stereoIn;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void enableVolume(int volumeLevel) {
        System.out.println("Enabling volume at " + volumeLevel);
    }

    public void off() {
        System.out.println("Stereo is off");
    }
}