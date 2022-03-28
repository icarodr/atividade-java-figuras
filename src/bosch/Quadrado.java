package bosch;

public class Quadrado {

    String nome;
    double lado;
    double perimetro;

    double calcaArea() {
        return lado * lado;

    }
    double calcPerimetro(){
        return 4 * lado;

    }
}