package org.example;

public class Task2 {
    public static void main(String[] args) {
        ToStrFunction<String, String> toStrFunction = (String a, String b) -> {
            if(a.length() < b.length()){
                return b;
            }else
                return a;
        };
        System.out.println(toStrFunction.Boo("Мама мыла кошку", "А папа мыл собаку"));
    }

}
