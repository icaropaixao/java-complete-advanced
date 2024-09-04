package introducao.exercicios;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        System.out.println("Sistema para calcular salario");

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int numero = ler.nextInt();

        System.out.println("Digite o total de horas trabalhadas no mês: ");
        int horasTrabalhadas =  ler.nextInt();

        double salario = horasTrabalhadas * 9.04 ;
                                                                  // formatando para duas casas decimais
        System.out.printf("O salario do funcionario "+ numero + " Neste mês é de: %.2f%n", salario);

    }
}
