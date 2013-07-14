package org.xander.Command;

public class GarageDoorOpenCommand implements Command {
    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();
    }

    @Override
    public void undo() {
        garage.close();
    }
}