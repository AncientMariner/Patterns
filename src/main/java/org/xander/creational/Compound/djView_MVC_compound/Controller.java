package org.xander.creational.Compound.djView_MVC_compound;

public interface Controller {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
