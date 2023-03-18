package com.example.lesson_1;

public class task4 {
    public static  void main(String[] args){
        int n = 256;
        System.out.print("Сумма цифр числа " + n + " равна " +((n%10) + ((n/10)%10) + ((n/100)%10)));
    }
}