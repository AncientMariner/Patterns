package org.xander.behavioral.Command.SimpleRemoteControl;

import org.xander.behavioral.Command.Command;

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