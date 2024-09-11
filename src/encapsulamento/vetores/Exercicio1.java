package encapsulamento.vetores;

import  java.util.Scanner;


       // MOSTRA NUMEROS NEGATIVOS NA TELA
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros você vai digitar: ");
        n = scan.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                System.out.printf("%d\n", numeros[i]);
            }

            scan.close();

        }
    }
}
