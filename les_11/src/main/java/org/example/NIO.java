package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO implements FileInterface {
    public void writeFile(String name, String str) {
        try {
            Path path = Paths.get(name);
            Files.write(path, str. getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(String name) {
        String s = null;
        try {
            Path path = Paths.get(name);
            s = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
