package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        HashMap map = counter.countWords("Спящая красавица.txt");
        for (Object key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}

class Counter {
    private String[] words(String st) {
        st = st.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
        st = st.toLowerCase();
        String[] words = st.split(" ");
        return words;
    }

    public HashMap<String, Integer> countWords(String name) {
        HashMap<String, Integer> map = new HashMap();
        File file = new File(name);
        String st = "";
        try (BufferedReader br = new BufferedReader(new FileReader(name))){
            String s;
            while ((s = br.readLine()) != null) {
                st = st + s + ' ';
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String[] words = words(st);
        for(String word: words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        return map;
    }
}