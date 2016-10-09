package org.xander.creational.Compound.djView_MVC_compound;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        Controller model = new HeartController(heartModel);
    }
}

