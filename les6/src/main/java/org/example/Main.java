package org.example;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair(3, "5 cat");
        System.out.println((int)p.getKey());
        System.out.println((String) p.getValue());
        System.out.println((int)p.getKey());
        System.out.println((String)p.getValue());
    }
}