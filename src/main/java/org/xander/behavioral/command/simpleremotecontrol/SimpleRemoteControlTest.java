package org.xander.behavioral.command.simpleremotecontrol;

import org.xander.behavioral.command.Garage;
import org.xander.behavioral.command.GarageDoorOpenCommand;
import org.xander.behavioral.command.Light;
import org.xander.behavioral.command.LightOnCommand;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light("Garage light");
        LightOnCommand lightOn = new LightOnCommand(light);

        Garage garage = new Garage();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garage);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();
    }
}