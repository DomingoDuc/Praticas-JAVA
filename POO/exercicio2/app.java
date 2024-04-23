package EXERCICIOS_POO.exercicio2;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f", employee.Name, employee.NetSalary());
        System.out.print("\nWhich percentage to increase salary? ");
        double per = sc.nextDouble();
        employee.IncreaseS(per);

        System.out.printf("Updated data: %s, $ %.2f", employee.Name, employee.GrossSalary);




        sc.close();

    }


}
