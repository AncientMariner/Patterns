package org.xander.creational.compound.djview_mvc_compound;

public class DJTestDrive {

    public static void main(String[] args) {
        GeneralBeatModel model = new BeatModel();
        Controller controller = new BeatController(model);
    }
}

