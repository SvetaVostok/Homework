import java.lang.reflect.Method;
import static java.awt.Color.*;

public class Main {
    public static void main(String[] args) {

        print(new Messages());
    }
    public static void print(Messages name){
        Class clazz = name.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods){
            method.setAccessible(true);
            if (method.isAnnotationPresent(Paint.class)){
                String style = method.getAnnotation(Paint.class).style();
                try {
                    if(style.equals("hurray")) {
                        System.out.println(method.getAnnotation(Paint.class).color() + "^^" + method.invoke(name) + "^^" + Color.RESET);
                    } else if(style.equals("arrow")) {
                        System.out.println(method.getAnnotation(Paint.class).color() + "->" + method.invoke(name) + "<-" + Color.RESET);
                    } else if(style.equals("!")) {
                        System.out.println(method.getAnnotation(Paint.class).color() + "!!" + method.invoke(name) + "!!" + Color.RESET);
                    }
                }
                catch(Exception e){
                    System.out.println("Произошла ошибка" + e);
                }

            }else if(name.getClass().isAnnotationPresent(Paint.class)){
                String style = name.getClass().getAnnotation(Paint.class).style();
                try {
                    if(style.equals("hurray")) {
                        System.out.println(name.getClass().getAnnotation(Paint.class).color() + "^^" + method.invoke(name) + "^^" + Color.RESET);
                    } else if(style.equals("arrow")) {
                        System.out.println(name.getClass().getAnnotation(Paint.class).color() + "->" + method.invoke(name) + "<-" + Color.RESET);
                    } else if(style.equals("!")) {
                        System.out.println(name.getClass().getAnnotation(Paint.class).color() + "!!" + method.invoke(name) + "!!" + Color.RESET);
                    }
                }
                catch(Exception e){
                    System.out.println("Произошла ошибка" + e);
                }
            }
        }
    }
}
