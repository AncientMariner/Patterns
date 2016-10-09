package org.xander.behavioral.Command;

public class GarageDoorCloseCommand implements Command {
    Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();
    }

    @Override
    public void undo() {
        garage.open();
    }
}