package org.xander.creational.Compound.djView_MVC_compound;

public class DJTestDrive {

    public static void main(String[] args) {
        GeneralBeatModel model = new BeatModel();
        Controller controller = new BeatController(model);
    }
}

