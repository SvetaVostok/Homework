package org.example;

public class Task3 {
    public static void main(String[] args) {
        evaluate(1.3, 2.8, 4.8, (a, b, c) -> b*b - 4*a*c);
        evaluate(-9.3, 0, 9.2, (a, b, c) -> b*b - 4*a*c);
    }

    public static void evaluate(double a, double b, double c, ToBeDiskriminant<Double> toBeDiskriminant) {
        System.out.println(toBeDiskriminant.Boo(a, b, c));
    }
}
