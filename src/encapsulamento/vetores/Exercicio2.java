package encapsulamento.vetores;

import java.util.Scanner;

// CALCULA MEDIA E SOMA DE VETORES
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int n;
        double soma, media;

        System.out.print("Quantos numeros vc vai digitar? ");
        n = scan.nextInt();

        double numeros[] = new double[n];

        for (int i = 0; i < numeros.length; i++ ){
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextDouble();

        }

        soma = 0;
        for (int i=0; i<n; i++) {
            soma = soma + numeros[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", numeros[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);


        scan.close();
    }
}
