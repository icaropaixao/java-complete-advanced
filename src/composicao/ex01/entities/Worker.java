package composicao.ex01.entities;

import composicao.ex01.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;

    // associacões
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    // construtor
    public Worker(){

    }
    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // getters setters
    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // metodos

    public void addContracts(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    // salario do mês
    public double income(int year, int month) {
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                soma += c.totalValue();
            }
        }
        return soma;
    }
}
