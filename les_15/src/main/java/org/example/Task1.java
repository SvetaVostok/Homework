package org.example;

public class Task1 {

    public static void main(String[] args) {
        evaluate(100, n -> n % 13 == 0);
        evaluate(169, n -> n % 13 == 0);
    }

    public static void evaluate(int n, ToBiFunction<Boolean, Integer> toIntBiFunction) {
        System.out.println(toIntBiFunction.Boo(n));
    }
}
