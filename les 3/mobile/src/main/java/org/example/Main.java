package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("89213610211","Xiaomi", 50);
        phone.receiveCall("Начальник");
        phone.receiveCall("Мама");
        phone.sendMessage();
        System.out.println(phone.toString());
    }
}