package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many vector numbers: ");
        int n1 = sc.nextInt();

        int[] vec = new int[n1];
        double AVG = 0;
        double sum = 0;

        for(int i=0;i<n1;i++){
            System.out.print("Enter a number: ");
            vec[i] = sc.nextInt();
            if(vec[i]%2==0){
                sum +=vec[i];
            }
        }
        AVG = sum/n1;
        if(sum==0){
            System.out.println("Without even numbers!");
        }else{
            System.out.printf("Average of even numbers: %.2f", AVG);
        }





        sc.close();

    }


}
