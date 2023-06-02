package org.example;

public class Main {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[5];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }
        for (int i = 0; i < philosophers.length; i++) {
            if (i == philosophers.length - 1){
                philosophers[i] = new Philosopher(forks[0], forks[philosophers.length-1]);
            }
            else{
                philosophers[i] = new Philosopher(forks[i], forks[(i + 1) % 5]);
            }
            Thread thread = new Thread(philosophers[i], "Философ " + (i+1));
            thread.start();
        }
     }
}