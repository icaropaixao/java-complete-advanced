package polimorfismo_heranca.exemplos.banco.application;

import polimorfismo_heranca.exemplos.banco.entities.Account;
import polimorfismo_heranca.exemplos.banco.entities.BusinessAccount;
import polimorfismo_heranca.exemplos.banco.entities.SavingAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(333,"ícaro",130000);

        BusinessAccount bacc = new BusinessAccount(334,"Manu",0,500);

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
