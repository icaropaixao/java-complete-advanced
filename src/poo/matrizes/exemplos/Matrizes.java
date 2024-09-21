package poo.matrizes.exemplos;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [][] matriz = new int[n][n]; // criando matriz bidimesional

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Valores na diagonal da matriz");
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("------------------------");

        System.out.println("Numeros negativos");
        int contador = 0;
        for (int i = 0 ; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 0 ){ // se o numero for negativo adiciona um no contador
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de Numeros negativos na matriz:" + contador);
        scan.close();
  }
}
