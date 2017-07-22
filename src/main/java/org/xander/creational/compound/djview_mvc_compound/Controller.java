package org.xander.creational.compound.djview_mvc_compound;

public interface Controller {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
