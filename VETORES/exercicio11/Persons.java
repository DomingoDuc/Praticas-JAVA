package EXERCICIOS_POO.EXERCICIOS_VECTORES.exercicio11;

public class Persons {

    private double Height;
    private char genre;

    public Persons(double height, char genre) {
        Height = height;
        this.genre = genre;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }
}
