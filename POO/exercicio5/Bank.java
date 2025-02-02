package EXERCICIOS_POO.exercicio5;
public class Bank {

    private int account;
    private String name;
    private double balance;

    public Bank (int account, String name){
        this.account = account;
        this.name = name;
    }
    public Bank (int account, String name, double initialDep){
        this.account = account;
        this.name = name;
        deposit(initialDep);
    }

    public int getAccount(){
        return account;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }



    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw (double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
                + account
                + ", "
                + "Holder: "
                + name
                + ", "
                + "Balance: $"
                + String.format("%.2f", balance);
    }





}
