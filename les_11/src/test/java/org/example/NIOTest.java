package org.example;

import org.junit.Assert;

import static org.junit.Assert.*;

public class NIOTest {

    @org.junit.Test
    public void writeFile() {
        FileInterface nioFile = new NIO();
        String str = "Мама мыла раму";
        nioFile.writeFile("NIOTest.txt", str);
        String nioData = nioFile.readFile("NIOTest.txt");
        Assert.assertEquals(str, nioData);
    }

    @org.junit.Test
    public void readFile() {
        FileInterface nioFile = new NIO();
        String str = "Мама мыла раму";
        String nioData = nioFile.readFile("NIOTest.txt");
        Assert.assertEquals(str, nioData);
    }
}