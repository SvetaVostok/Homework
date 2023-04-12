package org.example;

import org.junit.Assert;

import static org.junit.Assert.*;

public class IOTest {

    @org.junit.Test
    public void writeFile() {
        FileInterface ioFile = new IO();
        String str = "Мама мыла раму";
        ioFile.writeFile("IOTest.txt", str);
        String ioData = ioFile.readFile("IOTest.txt");
        Assert.assertEquals(str, ioData);
    }

    @org.junit.Test
    public void readFile() {
        FileInterface ioFile = new IO();
        String str = "Мама мыла раму";
        String ioData = ioFile.readFile("IOTest.txt");
        Assert.assertEquals(str, ioData);
    }
}