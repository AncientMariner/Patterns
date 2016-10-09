package org.xander.behavioral.Command.commandUsingLambda;

public class CommandTest {
    public static void main(String[] args) {
        Macro macro1 = new Macro();
        FileSystemReceiver fileReceiver = new FileReceiver();
        macro1.record(new OpenFile(fileReceiver));
        macro1.run();

        Macro macro2 = new Macro();
        macro2.record(() -> fileReceiver.writeFile());
        macro2.run();

        Macro macro3 = new Macro();
        macro3.record(fileReceiver::closeFile);
        macro3.run();
    }
}
