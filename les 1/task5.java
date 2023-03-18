package com.example.lesson_1;
import java.util.Scanner;

public class task5 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой вес");
        int v = sc.nextInt();
        sc.close();
        double x;
        x = 0.17*v;
        System.out.println("Ваш вес на Луне равен " + x);
    }
}