package org.example;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число a: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число b: ");
            int b = scanner.nextInt();

            MultNumber umn = new MultNumber();
            try{
                umn.Calc(a, b);
                System.out.println(a*b);
            }
            catch (MultException e){
                System.out.println("Произведение не вычислить");
            }
            finally {
                System.out.println("Программа завершена");
            }
        }
}
