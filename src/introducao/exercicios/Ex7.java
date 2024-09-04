package introducao.exercicios;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {

        System.out.println("Dias da semana");

        Scanner scan = new Scanner(System.in);

        int dia;
        do {
            System.out.println("Digite um número entre 1 e 7:");
            dia = scan.nextInt();
        } while (dia < 1 || dia > 7);

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                // Este trecho nunca será alcançado, pois o loop já garantiu um valor entre 1 e 7
                break;
        }

    }
}

