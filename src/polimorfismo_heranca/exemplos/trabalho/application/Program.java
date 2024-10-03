package polimorfismo_heranca.exemplos.trabalho.application;

import polimorfismo_heranca.exemplos.trabalho.entities.Employee;
import polimorfismo_heranca.exemplos.trabalho.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println(" número de funcionarios: ");

        int n = scan.nextInt();

        for (int i = 1; i < n ; i++){
            System.out.println("Funcionario #" + i + " Data:");
            System.out.print("O funcionario é terceirizado? (y/n)");
            char ch = scan.next().charAt(0); // le se o funcionario e terceirizado ou não

            scan.nextLine(); // consumir linha faltante

            System.out.print("Name: ");
            String name =scan.nextLine();
            System.out.print("Hours ");
            int hours = scan.nextInt();
            System.out.print("Valor por hora: ");
            double valuePerHour = scan.nextDouble();

            if (ch == 'y'){
                System.out.print("Valor adicional: ");
                double additionalCharge = scan.nextDouble();
                list.add(new OutSourcedEmployee(name, hours, valuePerHour,additionalCharge));
                // funcionario terceirizado adicionado
            }else{

                list.add(new Employee(name,hours,valuePerHour));
                // funcionario comum adicionado
            }



        }

        System.out.println();
        System.out.println("PAGAMENTOS");

        // para cada emp na lista rodar o for
        for (Employee emp : list) {

            System.out.println(emp.getName() + " - $ " + String.format("%.2f" ,emp.payment())) ;
        }

        scan.close();
    }
}
