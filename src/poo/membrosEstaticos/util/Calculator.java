package poo.membrosEstaticos.util;

public class Calculator {


    // valores estaticos que não mudam ou não precisam ser modificados para cada caso de calculo etc...
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return  2.0 * PI * radius;

    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
