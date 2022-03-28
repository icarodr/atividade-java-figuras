package bosch;

public class Triangulo {
    String nome;
    double lado;

    double calcArea(){
        return (lado * lado) / 2;

    }
    double calcPerimetro(){
        return 3 * lado;

    }
}