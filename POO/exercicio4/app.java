package EXERCICIOS_POO.exercicio4;

import java.util.Locale;
import java.util.Scanner;


public class app {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBuy = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amount(dollarPrice,dollarBuy));

        sc.close();
    }
}
