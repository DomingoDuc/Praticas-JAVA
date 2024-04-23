package EXERCICIOS_POO.exercicio1;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class app {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.Width  = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.Perimeter());
        System.out.printf("DIAGONAL  = %.2f\n", rectangle.Diagonal());
        sc.close();
    }
}
