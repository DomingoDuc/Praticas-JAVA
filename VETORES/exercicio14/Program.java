package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio14;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Matrix dimention: ");
        int n = sc.nextInt();
        // Matrix creation (bi-dimentional)
        int [][] mat = new int[n][n];

        // podemos expresar o tamanho das linhas com mat.length
        // mesmo com as colunas mat[i].length
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i=0;i<mat.length;i++){
            System.out.print(mat[i][i]+" ");
        }

        int count = 0;
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("\nNegative numbers: " + count);

        sc.close();
    }
}
