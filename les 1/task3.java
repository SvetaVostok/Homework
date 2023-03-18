package com.example.lesson_1;
import java.util.Scanner;

public class task3 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        sc.close();
        int t = n;
        int f = 0;
        while (n > 0) {
            int dig;
            dig = n%10;
            f = f*10 + dig;
            n = n / 10;
        }
        if (t == f){
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }
}