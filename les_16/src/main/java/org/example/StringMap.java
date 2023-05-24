package org.example;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class StringMap {
    public LinkedHashMap<String, String> createMap(String s){
        String[] str = s.split(" ");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length-1; i = i + 2){
            map.put(str[i], str[i+1]);
        }

        return map;
    }

    public String createString(LinkedHashMap<String, String> map){
        String s = map.
                entrySet().
                stream().
                map(linkedMapHash -> linkedMapHash.getKey() + " " + linkedMapHash.getValue()).
                collect(Collectors.joining(" "));
        return s;
    }
}