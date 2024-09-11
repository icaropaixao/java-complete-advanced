package encapsulamento.vetores;

import poo.aplications.projetoProdutos.entities.Product;

import  java.util.Scanner;

public class Exemple1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        Product[] vect = new Product[n]; // criando o vetor


        System.out.println("Percorrendo array");
        // percorrendo o vetor
        for (int i =0; i < vect.length; i++){
            scan.nextLine(); // quebra de linha para poder fazer a leitura do proximo scan
            String name = scan.nextLine();

            double preco = scan.nextDouble();
            vect[i] = new Product(name, preco);

        }

        double soma = 0.0;

        // calculando o preço
        for (int i = 0; i < vect.length ; i++){
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("A média é: %.2f", media);

        scan.close();
    }
}
