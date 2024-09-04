package introducao.exercicios;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        double senha = scan.nextDouble();

        while (senha != 2002){
            System.out.println("Senha incorreta! Digite novamente: ");
            senha = scan.nextDouble();
        }

        System.out.println("Login efetuado com sucesso!");


    }
}
