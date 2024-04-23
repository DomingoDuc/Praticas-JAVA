package EXERCICIOS_POO.exercicio1;

public class Rectangle {

    public double Width;
    public double Height;

    public double area(){
        return Width*Height;
    }
    public double Perimeter(){
        return (Width+Height)*2;
    }
    public double Diagonal(){
        return Math.sqrt((Width*Width)+(Height*Height));
    }

}
