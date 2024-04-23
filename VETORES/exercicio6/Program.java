package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("how many numbers will the vector have: ");
        int n1 = sc.nextInt();

        double[] vec = new double[n1];
        double AVG = 0;
        double sum = 0;

        for(int i=0;i<n1;i++){
            System.out.print("Enter a number: ");
            vec[i] = sc.nextDouble();
            sum += vec[i];
        }
        AVG = sum/n1;
        System.out.println();
        System.out.print("Vector average: "+ AVG);
        System.out.println();
        System.out.println("Numbers under average: ");
        for(int i=0;i<n1;i++){
            if(vec[i]<AVG){
                System.out.println(vec[i]);
            }

        }





        sc.close();
    }
}
