package org.xander.behavioral.command.commandusinglambda;

public class FileReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("opening a file");
    }

    @Override
    public void writeFile() {
        System.out.println("writing to a file");
    }

    @Override
    public void closeFile() {
        System.out.println("closing a file");
    }
}
