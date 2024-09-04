package introducao.exercicios;
import  java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Sistema para ler número e saber se é par ou impar");

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = ler.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O número "+numero+" é par");
        }else {
            System.out.println("O número "+numero+" é impar");
        }

    }
}
