package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double biggest = 0;
        double smallest = 100;
        double AVG = 0;
        double sum = 0;
        int mens = 0;
        int wom = 0;

        System.out.print("How many persons: ");
        int n = sc.nextInt();

        Persons[] vec = new Persons[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.printf("%dth person height: ", i+1);
            double alt = sc.nextDouble();
            System.out.printf("%dth person genre: ", i+1);
            char response = sc.next().charAt(0);
            vec[i] = new Persons(alt, response);
        }
        for (int i=0;i<n;i++){
            if(vec[i].getHeight()>biggest){
                biggest = vec[i].getHeight();
            }
        }
        for (int i=0;i<n;i++){
            if (vec[i].getHeight()<smallest){
                smallest = vec[i].getHeight();
            }
        }
        for (int i=0;i<n;i++){
            if(vec[i].getGenre()=='F'){
                sum += vec[i].getHeight();
                wom++;
            }
        }
        for (int i=0;i<n;i++){
            if(vec[i].getGenre()=='M'){
                mens++;
            }
        }
        AVG = sum/wom;

        System.out.println();
        System.out.printf("Shortest height: %.2f", smallest);
        System.out.println();
        System.out.printf("Greatest height: %.2f", biggest);
        System.out.println();
        System.out.printf("Average female height: %.2f", AVG);
        System.out.println();
        System.out.printf("Mens number: %d", mens);
        System.out.println();
        System.out.printf("Women number: %d", wom);


        sc.close();
    }

}
