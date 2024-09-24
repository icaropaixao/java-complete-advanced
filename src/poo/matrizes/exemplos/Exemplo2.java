package poo.matrizes.exemplos;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        int x = scan.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        scan.close();
    }
}