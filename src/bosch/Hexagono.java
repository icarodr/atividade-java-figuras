package bosch;

public class Hexagono {
    String nome;
    double lado;

    double calcArea(){
        return (3*(lado*lado) * Math.sqrt(3)) / 2;
    }
    double calcPerimetro(){
        return 6 * lado;
    }
}