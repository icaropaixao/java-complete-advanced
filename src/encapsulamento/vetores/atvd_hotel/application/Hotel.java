package encapsulamento.vetores.atvd_hotel.application;

import encapsulamento.vetores.atvd_hotel.entities.Aluguel;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluguel[] quartos = new Aluguel[10];

        System.out.print("Quantos quartos quer alugar? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) { // Corrigido: começa em 0 e vai até n-1
            System.out.println();
            System.out.println("Quarto #" + (i + 1) + ": "); // Ajustado para exibir a numeração correta do quarto
            System.out.print("Nome: ");
            scan.nextLine(); // Limpa o buffer

            String name = scan.nextLine();

            System.out.print("Email: ");
            String email = scan.next();
            System.out.print("Número do quarto: ");
            int numeroDoQuarto = scan.nextInt();

            // vetor quartos na posição "numeroDoQuarto" recebe o nome e email do aluguel
            quartos[numeroDoQuarto] = new Aluguel(name, email);
        }

        System.out.println();
        System.out.println("Quartos alugados:");

        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        scan.close();
    }
}
