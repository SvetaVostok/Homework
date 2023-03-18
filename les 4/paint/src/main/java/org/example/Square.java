package org.example;

import java.lang.Math;

import static java.lang.Math.abs;

public class Square extends Figure implements Drawable{
    public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
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
    public double area(){
        double s = 0;
        if ((point.x1 == point.x)||(point.y1 == point.y)){
            if (point.x1 == point.x){
                s = abs(point.y1 - point.y)*abs(point.y1 - point.y);
            }else{
                s = abs(point.x1 - point.x)*abs(point.x1 - point.x);
            }
        }
        return s;
    }
    @Override
    public double perimetr(){
        double p = 20;
        if ((point.x1 == point.x)||(point.y1 == point.y)){
            if (point.x1 == point.x){
                p = abs(point.y1 - point.y)*4;
            }else{
                p = abs(point.x1 - point.x)*4;
            }
        }
        return p;
    }

    @Override
    public String draw(){
        String s = "нарисована чёрный квадрат с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
              "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.WHITE) {
            s = "нарисован белый квадрат с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.BLACK){
            s = "нарисован черный квадрат с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.RED){
            s = "нарисован красный квадрат с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.GREEN){
            s = "нарисован зелёный квадрат с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }else if (color == Color.YELLOW){
            s = "нарисован жёлтый квадрат с кодинатами (" + point.x+","+point.y+");"+" (" + point.x1+","+point.y1+");"+
                    "  (" + point.x2+","+point.y2+");"+ " (" + point.x3+","+point.y3+")";
        }
        return s;
    }
}
