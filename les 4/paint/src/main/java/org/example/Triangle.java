package org.example;

public class Triangle extends Figure implements Drawable{
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
     point.x = x1;
     point.x1 = x2;
     point.y = y1;
     point.y1 = y2;
     point.x2 = x3;
     point.y2 = y3;
    }
    @Override
    public double area(){
        double s = 0;
        double a, b, c, p;
        a = Math.sqrt(Math.pow((point.x1- point.x), 2) + Math.pow((point.y1- point.y), 2));
        b = Math.sqrt(Math.pow((point.x2- point.x), 2) + Math.pow((point.y2- point.y), 2));
        c = Math.sqrt(Math.pow((point.x1- point.x2), 2) + Math.pow((point.y1- point.y2), 2));
        p = (a + b + c)*0.5;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    @Override
    public double perimetr() {
        double p = 0;
        double a, b, c;
        a = Math.sqrt(Math.pow((point.x1- point.x), 2) + Math.pow((point.y1- point.y), 2));
        b = Math.sqrt(Math.pow((point.x2- point.x), 2) + Math.pow((point.y2- point.y), 2));
        c = Math.sqrt(Math.pow((point.x1- point.x2), 2) + Math.pow((point.y1- point.y2), 2));
        p = a + b + c;
        return p;
    }
    @Override
    public String draw(){
        String s = "нарисована чёрный треугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                "  (" + point.x2+","+point.y2+")";
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.WHITE) {
            s = "нарисован белый треугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+")";
        }else if (color == Color.BLACK){
            s = "нарисован черный треугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+")";
        }else if (color == Color.RED){
            s = "нарисован красный треугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+")";
        }else if (color == Color.GREEN){
            s = "нарисован зелёный треугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+")";
        }else if (color == Color.YELLOW) {
            s = "нарисован жёлтый треугольник с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+")";
        }
        return s;
    }
}