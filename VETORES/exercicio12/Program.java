package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio12;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();
        Students[] vec  = new Students[9];

        for (int i=0;i<n;i++){
            sc.nextLine();
            System.out.printf("Rent #%d: \n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vec[room] = new Students(name, email, room);
        }

        System.out.println();
        System.out.println("Busy Rooms:");
        for (int i=0;i<9;i++){
            if(vec[i] != null){
                System.out.println(vec[i]);
            }
        }

        sc.close();

    }
}
