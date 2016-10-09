package org.xander.creational.Compound.djView_MVC_compound;

public class HeartAdapter implements GeneralBeatModel {
    GeneralHeartModel heart;

    public HeartAdapter(GeneralHeartModel heart) {
        this.heart = heart;
    }

    public void initialize() {
    }

    public void on() {
    }

    public void off() {
    }

    public int getBPM() {
        return heart.getHeartRate();
    }

    public void setBPM(int bpm) {
    }

    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
