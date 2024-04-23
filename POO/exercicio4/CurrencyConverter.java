package EXERCICIOS_POO.exercicio4;

public class CurrencyConverter {


    public static final double IOF = 0.06;

    public static double amount (double price, double buy){
        return (price*buy)*IOF + (price*buy);
    }


}
