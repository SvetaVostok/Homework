package org.example;

public class FigureUtil {
    private FigureUtil(){
    }
    public static double area(Figure figure){
        double s = figure.area();
        return s;
    }
    public static double perimetr(Figure figure){
        double p = figure.perimetr();
        return p;
    }
    public static void draw(Drawable figure) {
            String s = figure.draw();
            System.out.println(s);
    }
    public static void draw(Drawable figure, Figure.Color color) {
            String s = figure.draw(color);
            System.out.println(s);
    }

}
