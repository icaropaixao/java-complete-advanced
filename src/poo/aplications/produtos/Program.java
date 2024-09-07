package poo.aplications.produtos;

import poo.aplications.produtos.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scan = new Scanner(System.in);

        Product produto = new Product();
        String resp = "";

        do {
            System.out.println("Insira os dados do produto:");

            System.out.print("Nome: ");
            produto.name = scan.nextLine();

            System.out.print("Preço: ");
            produto.preco = scan.nextDouble();

            System.out.print("Quantidade: ");
            produto.quantidade = scan.nextInt();

            // Consumir a linha pendente para evitar problemas no próximo nextLine()
            scan.nextLine();
            System.out.println("Nome do produto: " + produto.name +
                    "\nPreço: R$" + produto.preco +
                    "\nQuantidade: " + produto.quantidade);

            System.out.println("Deseja adicionar outro produto? (s/n)");
            resp = scan.nextLine();

        } while (resp.equals("s"));

        scan.close();
    }
}

