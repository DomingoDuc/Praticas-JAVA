package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people: ");
        int n1 = sc.nextInt();
        int older=0;
        int m_indicator = -1;
        People[] vec = new People[n1];

        for(int i=0;i<n1;i++){
            sc.nextLine();
            System.out.printf("%dth person data: \n", i+1);
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Age: ");
            int idade = sc.nextInt();
            vec[i] = new People(nome, idade);
        }
        for(int i=0;i<n1;i++){
            if(vec[i].getAge()> older){
                older = vec[i].getAge();
                m_indicator = i;
            }
        }
        System.out.print("Most older person: ");
        System.out.println(vec[m_indicator].getName());

        sc.close();
    }

}
