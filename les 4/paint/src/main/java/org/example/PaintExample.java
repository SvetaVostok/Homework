package org.example;

public class PaintExample {
    public static void main(String[] args) {
        Square square = new Square(12, 12, 12, 24, 24, 24, 24, 12);
        System.out.println(FigureUtil.area(square));
        FigureUtil.draw(square);
        Rectangle rectangle = new Rectangle(0, 0,0, 20,10,20,10,0);
        System.out.println(FigureUtil.perimetr(rectangle));
        Triangle tri = new Triangle(0,0,0,3,4,00);
        FigureUtil.draw(tri, Figure.Color.RED);
        Circle circle = new Circle(0,0,2,2);
        System.out.println(FigureUtil.area(circle));
        FigureUtil.draw(circle, Figure.Color.YELLOW);
        FigureUtil.draw(circle, Figure.Color.WHITE);
        FigureUtil.draw(circle);
    }

}
