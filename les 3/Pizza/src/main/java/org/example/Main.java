package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaOrder pizza = new PizzaOrder(PizzaOrder.Size.MEDDIUM, "Галкинская 3", true);
        pizza.order();
        pizza.cancel();
        pizza.setAddres("Орлова 6");
        pizza.order();
        System.out.println(pizza.toString());
    }
}