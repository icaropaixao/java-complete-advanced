package introducao.exercicios;

import  java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("PROGRAMA DE SOMA");

        System.out.println("Digite um valor:");
        int A = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int B = scan.nextInt();

        double resultado = A + B;
        System.out.println("resultado da soma: " + A + " + " + B + " = " + resultado);



        }

    }