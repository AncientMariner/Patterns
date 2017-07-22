package org.xander.behavioral.command;

public class LightRemoteControlWithUndoTest {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light garageLight = new Light("Garage light");

        LightOnCommand lightOnCommand = new LightOnCommand(garageLight);
        LightOffCommand lightOffCommand = new LightOffCommand(garageLight);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoCommandWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoCommandWasPushed();
    }
}