package com.example.lesson_1;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число не более 100");
        int n = sc.nextInt();
        sc.close();
    }

    enum Numeral {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);
        int weight;

        Numeral(int weight) {
            this.weight = weight;
        }
    }

    public static String roman(long n) {
        if( n <= 0) {
            throw new IllegalArgumentException();
        }

        StringBuilder buf = new StringBuilder();

        final Numeral[] values = Numeral.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].weight) {
                buf.append(values[i]);
                n -= values[i].weight;
            }
        }
        return buf.toString();
    }
}