package introducao.exercicios;
import  java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println("SISTEMA PARA CAULCULAR A DIFERENÇA DE PRODUTO");

        int A,B,C,D;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scan.nextInt();
        System.out.println("Digite o valor de C: ");
        C = scan.nextInt();
        System.out.println("Digite o valor de D: ");
        D = scan.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("A diferença entre os produtos é: " + diferenca);

    }
}
