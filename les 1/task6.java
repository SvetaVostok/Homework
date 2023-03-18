package com.example.lesson_1;
import java.util.Scanner;

public class task6 {
    public static  void main(String[] args) {
        int p;
        boolean Prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            p = n % i;
            if (p == 0) {
                Prime = false;
                break;
            }
        }
        if (Prime){
            System.out.println("Заданное число - простое");
        } else {
            System.out.println("Заданное число - составное");
        }
    }
}
