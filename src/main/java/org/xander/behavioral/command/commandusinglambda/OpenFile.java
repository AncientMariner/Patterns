package org.xander.behavioral.command.commandusinglambda;

public class OpenFile implements Action {

    private final FileSystemReceiver receiver;

    public OpenFile(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    public void perform() {
        receiver.openFile();
    }

}