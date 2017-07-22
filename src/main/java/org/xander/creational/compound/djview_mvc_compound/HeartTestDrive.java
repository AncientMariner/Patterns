package org.xander.creational.compound.djview_mvc_compound;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        Controller model = new HeartController(heartModel);
    }
}

