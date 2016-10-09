package org.xander.behavioral.Command.commandUsingLambda;

public class WriteFile implements Action {

    private final FileSystemReceiver receiver;

    public WriteFile(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }
 
    public void perform() {
        receiver.writeFile();
    }
 
}