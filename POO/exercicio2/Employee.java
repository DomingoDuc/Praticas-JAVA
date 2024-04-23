package EXERCICIOS_POO.exercicio2;

public class Employee {

    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary -= Tax;
    }

    public void IncreaseS(double per){
        GrossSalary = ((1+(per/100))*(GrossSalary+Tax))-Tax;
    }



}
