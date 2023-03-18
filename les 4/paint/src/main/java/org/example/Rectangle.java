package org.example;

import static java.lang.Math.abs;

public class Rectangle extends Figure implements Drawable{

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        point.x = x1;
        point.x1 = x2;
        point.y = y1;
        point.y1 = y2;
        point.x2 = x3;
        point.x3 = x4;
        point.y2 = y3;
        point.y3 = y4;
    }
    @Override
    public double area() {
        double s = 0;
        int a, b;
        if ((point.x1 != point.x)&&(point.y1 != point.y)){
            a = abs(point.x1 - point.x);
            b = abs(point.y1 - point.y);
            s = a*b;
        }else if((point.x2 != point.x)&&(point.y2 != point.y)){
            a = abs(point.x2 - point.x);
            b = abs(point.y2 - point.y);
            s = a*b;
        }else{
            a = abs(point.x3 - point.x);
            b = abs(point.y3 - point.y);
            s = a*b;
        }
        return s;
    }

    @Override
    public double perimetr() {
        double p = 0;
        int a, b;
        if ((point.x1 != point.x)&&(point.y1 != point.y)){
            a = abs(point.x1 - point.x);
            b = abs(point.y1 - point.y);
            p = 2*(a+b);
        }else if((point.x2 != point.x)&&(point.y2 != point.y)){
            a = abs(point.x2 - point.x);
            b = abs(point.y2 - point.y);
            p = 2*(a+b);
        }else{
            a = abs(point.x3 - point.x);
            b = abs(point.y3 - point.y);
            p = 2*(a+b);
        }
        return p;
    }

    @Override
    public String draw(){
        String s = "нарисован чёрный прямоугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.WHITE) {
            s = "нарисован белый прямоугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.BLACK){
            s = "нарисован черный прямоугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.RED){
            s = "нарисован красный прямоугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.GREEN){
            s = "нарисован зелёный прямоугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.YELLOW){
            s = "нарисован жёлтый прямоугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }
        return s;
    }
}
