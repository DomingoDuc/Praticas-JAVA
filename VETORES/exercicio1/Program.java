package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How much numbers: ");
        int n = sc.nextInt();
        Numbers[] vect = new Numbers[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            int numero = sc.nextInt();
            vect[i] = new Numbers(numero);
        }
        System.out.println("NEGATIVE NUMBERS");

        for(int i=0;i<n;i++){

                System.out.println(vect[i]);

        }



    }
}
