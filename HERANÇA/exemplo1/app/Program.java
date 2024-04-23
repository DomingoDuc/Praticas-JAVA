package UNIDADE14.exemplo1.app;

import UNIDADE14.exemplo1.entities.Account;
import UNIDADE14.exemplo1.entities.BussinesAccount;
import UNIDADE14.exemplo1.entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 0.0);
        BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING (converte objeto da subclase para super clase)

        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING (converte obj da superclasse para subclase)

        BussinesAccount acc4 = (BussinesAccount) acc2; // neste caso temos que fazer um casting manual
        acc4.loan(100.0);

        if (acc3 instanceof BussinesAccount){
            BussinesAccount acc5 = (BussinesAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        sc.close();
    }
}
