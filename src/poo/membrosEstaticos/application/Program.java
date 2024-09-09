package poo.membrosEstaticos.application;
import poo.membrosEstaticos.util.Calculator;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Digite o Raio: ");

        double radius = scan.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Circumference: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI);

    }


}
