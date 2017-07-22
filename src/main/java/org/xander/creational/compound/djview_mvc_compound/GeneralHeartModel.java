package org.xander.creational.compound.djview_mvc_compound;

public interface GeneralHeartModel {
    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}

