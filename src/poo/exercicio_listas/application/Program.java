package poo.exercicio_listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import poo.exercicio_listas.entities.Funcionarios;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int N = scan.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = scan.nextInt();
            }

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Salary: ");
            Double salary = scan.nextDouble();

            Funcionarios emp = new Funcionarios(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Informe o ID do funcionário que terá aumento salarial : ");
        int idsalary = scan.nextInt();

        // Integer pos = position(list, idsalary);

        Funcionarios emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        // if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = scan.nextDouble();
            //list.get(pos).increaseSalary(percent);
            emp.aumentarSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Funcionarios e : list) {
            System.out.println(e);
        }

        scan.close();
    }

    public static Integer position(List<Funcionarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}