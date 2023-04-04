package org.example;

import java.util.Scanner;

public class Writer {
    private  Scanner scanner = new Scanner(System.in);
    public String print(){
        System.out.print(">");
        String s = scanner.nextLine();
        return s;
    }

}
