package org.xander.behavioral.Command.commandUsingLambda;

public class CloseFile implements Action {

    private final FileSystemReceiver receiver;

    public CloseFile(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }
 
    public void perform() {
        receiver.closeFile();
    }
 
}