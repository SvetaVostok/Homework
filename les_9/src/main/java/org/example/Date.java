package org.example;

import java.time.LocalDate;

public class Date implements Command{

    @Override
    public String ans() {
        String s = String.valueOf(LocalDate.now());

        return s;
    }
}
