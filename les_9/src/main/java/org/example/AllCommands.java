package org.example;

import java.util.HashMap;

public class AllCommands {
    private HashMap<String, Command> cmd = new HashMap<>();

    public <K, T>HashMap all(){
        cmd.put("Time", new Time());
        cmd.put("Date", new Date());

        return cmd;
    }

    public String AnsCommand(String s){
        if (cmd.containsKey(s)){
            Command command = cmd.get(s);

            return command.ans();
        }else{

            return "Такой команды нет";
        }
    }
}
