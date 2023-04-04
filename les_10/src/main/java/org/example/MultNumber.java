package org.example;

public class MultNumber {
    public Integer Calc(int a, int b) throws MultException {
        if (a % 2 != 0 || b % 2 != 0) {
            throw new MultException("Одно из введенных чисел нечетное");
        }
        return a*b;
    }
}
