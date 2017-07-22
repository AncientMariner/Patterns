package org.xander.behavioral.command.simpleremotecontrol;

import org.xander.behavioral.command.Command;

public class SimpleRemoteControl {
    Command commandSlot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command commandSlot) {
        this.commandSlot = commandSlot;
    }

    public void buttonWasPressed() {
        commandSlot.execute();
    }
}