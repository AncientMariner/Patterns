package org.xander.behavioral.ExecuteAround;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterExample {
    private final FileWriter fileWriter;

    private FileWriterExample(final String filename) throws IOException {
        fileWriter = new FileWriter(filename);
    }

    private void close() throws IOException {
        fileWriter.close();
    }

    public void writeStuff(final String message) throws IOException {
        fileWriter.write(message);
    }

    public static void use(final String filename,
                           final UseInstance<FileWriterExample, IOException> block) throws IOException {
        final FileWriterExample fileWriterExample = new FileWriterExample(filename);
        try{
            block.accept(fileWriterExample);
        } finally {
            fileWriterExample.close();
            Files.delete(Paths.get(filename));
        }
    }

    public static void main(String[] args) {
        try {
            FileWriterExample.use("test.txt", writer -> writer.writeStuff("test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
