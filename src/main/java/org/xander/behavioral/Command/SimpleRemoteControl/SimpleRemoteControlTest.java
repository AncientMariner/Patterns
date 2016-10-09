package org.xander.behavioral.Command.SimpleRemoteControl;

import org.xander.behavioral.Command.Garage;
import org.xander.behavioral.Command.GarageDoorOpenCommand;
import org.xander.behavioral.Command.Light;
import org.xander.behavioral.Command.LightOnCommand;

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