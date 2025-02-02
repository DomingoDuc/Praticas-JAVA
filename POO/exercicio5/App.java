package EXERCICIOS_POO.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bank;


        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name  = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDep = sc.nextDouble();
            bank = new Bank(account, name, initialDep);
        }else{
            bank = new Bank(account, name);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bank);








        sc.close();

    }



}
