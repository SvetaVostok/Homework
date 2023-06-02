package org.example;

public class Philosopher implements Runnable {
    private final Object leftFork;
    private final Object rightFork;
    public Philosopher(Object leftFork, Object rightFork){
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " думает");
            synchronized(leftFork) {
                System.out.println(Thread.currentThread().getName() + " взял левую вилку");
                synchronized(rightFork) {
                    System.out.println(Thread.currentThread().getName() + " взял правую вилку");
                    System.out.println(Thread.currentThread().getName() + " ест");
                    System.out.println(Thread.currentThread().getName() + " положил правую вилку");
                }
                System.out.println(Thread.currentThread().getName() + " положил левую вилку и начинает думать");

            }
        }
    }
}