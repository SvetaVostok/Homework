package org.example;

public class Main {

        public static void main(String[] args) {
            Circle circle = new Circle(100, "Голубой");
            circle.toString();
            Circle cir = new Circle(144, "Зелёный");
            System.out.println(circle.toString());
        }

}