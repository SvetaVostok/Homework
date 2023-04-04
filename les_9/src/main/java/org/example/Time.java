package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time implements Command{
    @Override
    public String ans() {
        String s = String.valueOf(LocalTime.now());

        return s;
    }
}
