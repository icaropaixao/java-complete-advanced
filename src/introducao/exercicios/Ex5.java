package introducao.exercicios;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sistema para ler numero e saber se é positivo ou negativo");

        int numero;
        System.out.println("Digite um numero");
        numero = scan.nextInt();

        if (numero < 0){
            System.out.println("O numero " + numero + " É negativo");
        }else {
            System.out.println("O numero " + numero + " É positivo");
        }
    }
}
