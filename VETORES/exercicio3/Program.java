package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people: ");
        int n1 = sc.nextInt();
        double avg = 0;
        double sum = 0;
        int minor=0;
        double perc=0;

        People[] vect = new People[n1];

        for(int i=0; i<n1; i++){
            sc.nextLine();
            System.out.printf("%dth person\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height= sc.nextDouble();
            vect[i] = new People(name, age, height);
        }

        for(int i=0; i<n1; i++){
            sum += vect[i].getHeight();
        }
        avg = sum/n1;
        System.out.println();
        System.out.printf("Average height: %.2f\n", avg);

        for(int i=0; i<n1; i++){
            if(vect[i].getAge()<16){
                minor++;
            }
        }
        perc = ((double)minor/n1) * 100;

        System.out.println();
        System.out.printf("People under 16: %.1f%%\n", perc);
        for(int i=0; i<n1; i++){
            if(vect[i].getAge()<16){
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }




}
