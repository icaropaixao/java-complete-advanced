package encapsulamento.banco.application;

import java.util.Scanner;
import encapsulamento.banco.util.Conta;
public class Program{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Conta conta;

        System.out.print("Digite o numero da conta: ");
        int numero = scan.nextInt();

        System.out.println("Digite o titular: ");
        scan.nextLine();
        String titular = scan.nextLine();

        System.out.println("Tem deposito inicial? (s/n) ");
        char resp = scan.next().charAt(0); // lendo o caractere digitado

        if (resp == 's'){
            System.out.print("Digite o valor inicial: ");
            double valorInicial = scan.nextDouble();
            conta = new Conta(titular, valorInicial, numero);
        }else{
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("DADOS DA CONTA:");
        System.out.println(conta);

        System.out.println();

        System.out.println("Digite um valor para deposito");
        double valorDeposito = scan.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Conta Atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Deseja realizar um saque? (s/n)");
        char saque = scan.next().charAt(0); // lendo o caractere digitado

        if (saque == 's'){
            System.out.println("Digite o valor do saque: ");
            double valorSaque = scan.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("Conta Atualizada: ");
            System.out.println(conta);
        }else {
            System.out.println("Obrigado por utilizar nosso sistema!");
        }

        scan.close();

    }
}
