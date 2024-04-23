package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio10;

public class Students {

    private String name;
    private double n1;
    private double n2;
    public double AVG;



    public Students(String name, double n1, double n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.AVG = AVG;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getAVG() {
        return AVG;
    }
    public void setAVG(double AVG) {
        this.AVG = AVG;
    }
}
