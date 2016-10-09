package org.xander.behavioral.Command;

public class RemoteControlWithUndoTest {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light garageLight = new Light("Garage Light");
        Garage garageDoor = new Garage();
        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOnCommand = new LightOnCommand(garageLight);
        LightOffCommand lightOffCommand = new LightOffCommand(garageLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

    }
}