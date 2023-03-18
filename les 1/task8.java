package com.example.lesson_1;
import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static char randomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'A');
    }

    public static void main(String[] args) {
        char c = randomChar();
        Boolean count = true;
        Scanner sc = new Scanner(System.in);

        while(count){
            System.out.println("Введите букву от А до Z");
            char n = sc.next().charAt(0);
            if (n == c) {
                System.out.println("Right");
                count = false;
            } else {
                if (n < c) {
                    System.out.println("You're too low");
                    count = true;
                } else {
                    System.out.println("You're too high");
                    count = true;
                }
            }
        }
    }
}