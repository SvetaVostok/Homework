package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO implements FileInterface{
    public void writeFile(String name, String str) {
        try {
            FileWriter writer = new FileWriter(name);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(String name) {
        StringBuilder strBuild = new StringBuilder();
        try {
            FileReader reader = new FileReader(name);
            int p;
            while ((p = reader.read()) != -1) {
                strBuild.append((char) p);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuild.toString();
    }
}
