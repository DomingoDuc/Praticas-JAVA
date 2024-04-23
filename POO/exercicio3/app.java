package EXERCICIOS_POO.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.Name = sc.nextLine();
        System.out.print("n1: ");
        student.n1 = sc.nextDouble();
        System.out.print("n2: ");
        student.n2 = sc.nextDouble();
        System.out.print("n3: ");
        student.n3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f\n", student.FinalGrade());
        if(student.FinalGrade()<60.00){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60-student.FinalGrade());
        }else{
            System.out.println("PASS");
        }






    }

}
