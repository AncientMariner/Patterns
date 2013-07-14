package org.xander.Command;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.enableVolume(5);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}