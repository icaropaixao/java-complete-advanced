package poo.aplications.projetoProdutos;

import poo.aplications.projetoProdutos.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scan = new Scanner(System.in);
        Product produto = new Product("a",12);

        System.out.println("Insira os dados do produto:");

        System.out.print("Nome: ");
        produto.name = scan.nextLine();

        System.out.print("Preço: ");
        produto.preco = scan.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantidade = scan.nextInt();

        //  scan.nextLine();
        System.out.println(produto.toString()); // retornando o toString que modifiquei

        System.out.println();

        System.out.println("Quantos produtos desse quer adicionar ao estoque: ");
        int quantidade = scan.nextInt();
        produto.addProducts(quantidade); // atualizando o valor de produto

        System.out.println(produto.toString());

        System.out.println("Quantos produtos desse quer remover do estoque: ");
        quantidade = scan.nextInt();
        produto.removerProducts(quantidade); // removendo os itens de produto

        System.out.println(produto.toString());
        scan.close();
    }
}

