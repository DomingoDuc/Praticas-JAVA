package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio3;

public class People {

    private String nome;
    private int age;
    private double height;

    public People(String nome, int age, double height) {
        this.nome = nome;
        this.age = age;
        this.height = height;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
