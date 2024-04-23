package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio10;

import UNIDADE8_2.Exercicio3.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be registered: ");
        int n = sc.nextInt();

        Students[] vec = new Students[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.printf("Enter name, first and second grade of the %d student: \n", i+1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vec[i] = new Students(nome, nota1, nota2);
        }
        for(int i=0;i<n;i++){
            double avg =(vec[i].getN1()+vec[i].getN2())/2;
            vec[i].AVG =avg;
        }
        System.out.println("Approved students: ");
        for (int i=0;i<n;i++){
            if(vec[i].AVG>6.0){
                System.out.println(vec[i].getName());
            }
        }


        sc.close();
    }

}
