package org.example;

public class Circle extends Figure implements Drawable {

    public Circle(int x1, int y1, int x2, int y2){
        point.x = x1;
        point.x1 = x2;
        point.y = y1;
        point.y1 = y2;
    }
    @Override
    public double area(){
        double a, s = 0;
        a = Math.sqrt(Math.pow((point.x1- point.x), 2) + Math.pow((point.y1- point.y), 2));
        s = Math.PI*a*a;
        return s;
    }
    @Override
    public double perimetr() {
        double a, p = 0;
        a = Math.sqrt(Math.pow((point.x1- point.x), 2) + Math.pow((point.y1- point.y), 2));
        p = Math.PI*a*2;
        return p;
    }

    @Override
    public String draw(){
        String s = "нарисована чёрный круг с центром в" + point.x + " " + point.y;
        return s;
    }

    public String draw(Color color){
        String s = null;
        if (color == Color.WHITE) {
            s = "нарисован белый круг с центром в" + point.x + " " + point.y;
        }else if (color == Color.BLACK){
            s = "нарисован черный круг с центром в" + point.x + " " + point.y;
        }else if (color == Color.RED){
            s = "нарисован красный круг с центром в" + point.x + " " + point.y;
        }else if (color == Color.GREEN){
            s = "нарисован зелёный круг с центром в" + point.x + " " + point.y;
        }else if (color == Color.YELLOW){
            s = "нарисован жёлтый круг с центром в" + point.x + " " + point.y;
        }
        return s;
    }
}

