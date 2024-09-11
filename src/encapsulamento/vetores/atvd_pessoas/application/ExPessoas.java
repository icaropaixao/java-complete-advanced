package encapsulamento.vetores.atvd_pessoas.application;

import encapsulamento.vetores.atvd_pessoas.Model.Pessoa;

import java.util.Scanner;

public class ExPessoas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int n = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        // Entrada de dados
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            scan.nextLine(); // Consumir a quebra de linha pendente
            System.out.println("Nome: ");
            String nome = scan.nextLine();
            System.out.println("Idade: ");
            int idade = scan.nextInt();
            System.out.println("Altura: ");
            double altura = scan.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        // Calculando a altura média
        double somaAlturas = 0.0;
        for (int i = 0; i < n; i++) {
            somaAlturas += pessoas[i].getAltura();
        }
        double alturaMedia = somaAlturas / n;

        // Calculando a porcentagem de pessoas com menos de 16 anos
        int countMenor16 = 0;
        for (int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16) {
                countMenor16++;
            }
        }
        double porcentagemMenor16 = ((double) countMenor16 / n) * 100;

        // Exibindo os resultados
        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenor16);

        // Exibindo os nomes das pessoas com menos de 16 anos
        if (countMenor16 > 0) {
            System.out.println("Pessoas com menos de 16 anos:");
            for (int i = 0; i < n; i++) {
                if (pessoas[i].getIdade() < 16) {
                    System.out.println(pessoas[i].getNome());
                }
            }
        } else {
            System.out.println("Não há pessoas com menos de 16 anos.");
        }

        scan.close();
    }
}
