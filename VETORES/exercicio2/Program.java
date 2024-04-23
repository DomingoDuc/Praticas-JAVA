package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n1 = sc.nextInt();
        double[] vect = new double[n1];
        double sum = 0;
        double avg = 0;

        for (int i=0;i<n1;i++){
            System.out.print("Enter a number: ");
            vect[i]=sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for(int i=0;i<n1;i++){
            System.out.print("  "+vect[i]);
        }
        for(int i=0;i<n1;i++){
            sum += vect[i];
        }
        avg = sum/n1;
        System.out.println();
        System.out.printf("SOMA: %.2f", sum);
        System.out.println();
        System.out.printf("AVERAGE: %.2f", avg);







        sc.close();


    }
}
