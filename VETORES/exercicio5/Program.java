package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers for each vector: ");
        int n1 = sc.nextInt();

        int[] vecA = new int[n1];
        int[] vecB = new int[n1];
        int[] vecC = new int[n1];

        System.out.println("Vector A numbers: ");
        for(int i=0;i<n1;i++){
            vecA[i] = sc.nextInt();
        }
        System.out.println("Vector B numbers: ");
        for(int i=0;i<n1;i++){
            vecB[i] = sc.nextInt();
        }
        for(int i=0;i<n1;i++){
            vecC[i] = vecA[i]+vecB[i];
        }
        System.out.println("Resultant vector: ");
        for(int i=0;i<n1;i++){
            System.out.println(vecC[i]);
        }





    }
}
