package introducao.exercicios;

import  java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("SISTEMA DE CALCULAR O RAIO DO CIRCULO");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do Raio");
        double raio = scan.nextDouble();

        double PI = 3.14159;
        double area = PI * (raio * raio);

        System.out.println("O valor da área do circulo é: " + area);

    }
}
