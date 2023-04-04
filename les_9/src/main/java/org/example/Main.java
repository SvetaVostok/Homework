package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AllCommands allCommands = new AllCommands();
        HashMap cmd = allCommands.all();
        Writer writer = new Writer();
        exec(allCommands, writer);
    }

    private static void exec(AllCommands allCommands, Writer writer){
        String cmd = writer.print();
        while (!cmd.equals("Exit")){
            System.out.println(allCommands.AnsCommand(cmd));
            cmd = writer.print();
        }
    }

}