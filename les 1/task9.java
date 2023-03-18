package com.example.lesson_1;

public class task9 {
    public static  void main(String[] args) {
        float a = 1;
        float b = 6;
        float c = 100;
        double Diskrim = (b*b) - (4*a*c);

        if (Diskrim == 0){
            double x;
            x = (-b)/(2*a);
            System.out.println("Корень уравнения: x = " + x);
        } else {
            if (Diskrim > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(Diskrim)) / (2*a);
                x2 = (-b - Math.sqrt(Diskrim)) / (2*a);
                System.out.println("Корни уравнения: x1 = " +x1+ " и x2 = " +x2);
            } else {
                System.out.println("Корней нет");
            }
        }
    }
}