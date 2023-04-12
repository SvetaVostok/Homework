package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();

        System.out.println("Введите название первого файла: ");
        String name1 = scan.nextLine();

        System.out.println("Введите название второго файла: ");
        String name2 = scan.nextLine();

        FileInterface ioFile = new IO();
        ioFile.writeFile(name1, str);
        String ioData = ioFile.readFile(name1);
        System.out.println(ioData);

        FileInterface nioFile = new NIO();
        nioFile.writeFile(name2, str);
        String nioData = nioFile.readFile(name2);
        System.out.println(nioData);
    }
}


