package introducao.operacao_ternaria;

import java.util.Scanner;

public class Exemple_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // sem operação ternaria
        System.out.println("Digite um preço");
        double preco = scan.nextDouble();
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.5;
        }
        System.out.println("Desconto: "+desconto);

        System.out.println("---------------------------");

        // Com operação ternaria
        System.out.println("Digite o preco 2");
        double preco2 = scan.nextDouble();
                                        // if          else
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.5;
        System.out.println("Desconto: "+desconto2);
    }
}
