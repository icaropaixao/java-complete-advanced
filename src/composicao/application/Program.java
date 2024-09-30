package composicao.application;

import composicao.entities.Department;
import composicao.entities.HourContract;
import composicao.entities.Worker;
import composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import  java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Diga o nome do departamento: ");
        String departmentName = scan.nextLine();

        System.out.println("Dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = scan.nextLine();

        System.out.print("Level: ");
        String workerLevel = scan.nextLine();

        System.out.print("Salario base : ");
        double baseSalary = scan.nextDouble();

        Worker worker = new Worker(workerName ,WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("Quantos contratos esse trabalhador tem?");
        int n = scan.nextInt();

        // ler contratos
        for (int i = 1; i< n; i++) {
            System.out.print("Contrato numero #" + i + "Data:" );
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = scan.nextDouble();
            System.out.print("Duração do contrato (horas): ");
            int hours = scan.nextInt();

            // instanciando o contrato
            HourContract contract = new HourContract(contractDate, valorPorHora, hours);
            worker.addContracts(contract); // adicionando contrato ao trabalhador

        }

        System.out.println();
        System.out.print("Diga o mês e o ano para calcular o salario: (MM/yyyy)");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("O salario de : " + monthAndYear + ": " +String.format("%.2f", worker.income(year,month)));

        scan.close();
    }
}
