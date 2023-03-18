package com.example.lesson_1;
import java.util.Scanner;

public class task7 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел от 2 до 100");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
