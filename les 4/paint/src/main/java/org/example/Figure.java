package org.example;

import java.awt.*;

public abstract class Figure {
    Point point;
    public abstract double area();
    public abstract double perimetr();

    public enum Color{
        YELLOW,
        BLACK,
        GREEN,

        RED,
        WHITE
    }
}
