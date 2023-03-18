package org.example;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 2);
        matrix.setValueA(0,0,1);
        matrix.setValueA(0,1,2);
        matrix.setValueA(1,0,3);
        matrix.setValueA(1,1,4);
        matrix.Sum();
        matrix.print();
        matrix.del();
        matrix.Ym();
        matrix.print();
    }
}