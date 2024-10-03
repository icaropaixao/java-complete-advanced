package polimorfismo_heranca.exemplos.banco.application;

import polimorfismo_heranca.exemplos.banco.entities.Account;
import polimorfismo_heranca.exemplos.banco.entities.BusinessAccount;
import polimorfismo_heranca.exemplos.banco.entities.SavingAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(333,"ícaro",1000);

        BusinessAccount bacc = new BusinessAccount(334,"Manu",0,500);

        acc.withDraw(100);
        System.out.println("saldo: " + acc.getBalance());

        Account acc7 = new SavingAccount(111,"jose",300,0);
        acc7.withDraw(100);
        System.out.println("saldo: " + acc7.getBalance());

        BusinessAccount acc8 = new BusinessAccount(1121,"jose",200,0);
        acc8.withDraw(100);
        System.out.println("saldo: " + acc8.getBalance());

        // UPCASTING
        // é possivel atribuir objetos da super classe para um objeto da subclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount();
        Account acc3 = new SavingAccount();

        // DOWN CASTING
        // é possivel fazer o inverso fazendo este procedimentos abaixo
        BusinessAccount acc4 = (BusinessAccount) acc2;

        // Como fazer DOWN CASTING EM subclasses
        //  BusinessAccount acc5 = (BusinessAccount) acc3;

        // instanceof (Verifica se acc3 é uma instancia de BusinessAccount)
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;

            acc5.loan(200);
            System.out.println("Emprestimo");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
