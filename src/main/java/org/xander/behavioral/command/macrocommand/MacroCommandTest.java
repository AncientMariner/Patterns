package org.xander.behavioral.command.macrocommand;

import org.xander.behavioral.command.*;

public class MacroCommandTest {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light light = new Light("Party light");
        Stereo stereo = new Stereo("Party stereo");
        Garage garage = new Garage();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garage);

        Command[] partyOn = {lightOn, stereoOn, garageDoorOpen};
        Command[] partyOff = {lightOff, stereoOff, garageDoorClose};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        System.out.println();
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);


        remoteControl.onButtonWasPushed(0);
        remoteControl.undoCommandWasPushed();
    }
}
