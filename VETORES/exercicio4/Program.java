package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);


        System.out.print("How many numbers: ");
        int n1 = sc.nextInt();
        int[] vec = new int[n1];

        for(int i=0;i<n1;i++){
            System.out.print("Enter a number: ");
            vec[i] = sc.nextInt();
        }
        System.out.println("********************************");
        int par=0;
        System.out.println("Even numbers: ");
        for(int i=0;i<n1;i++){
            if(vec[i]%2==0){
                System.out.print(" "+vec[i]);
                par++;
            }
        }
        System.out.println();
        System.out.println("Even numbers quantity: "+par);







    }
}
