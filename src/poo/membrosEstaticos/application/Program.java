package poo.membrosEstaticos.application;
import poo.membrosEstaticos.util.Calculator;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o Raio: ");

        double radius = scan.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Circumference: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);

    }


}
