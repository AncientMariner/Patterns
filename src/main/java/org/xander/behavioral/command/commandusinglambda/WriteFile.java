package org.xander.behavioral.command.commandusinglambda;

public class WriteFile implements Action {

    private final FileSystemReceiver receiver;

    public WriteFile(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    public void perform() {
        receiver.writeFile();
    }

}