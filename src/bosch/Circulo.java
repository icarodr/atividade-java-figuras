package bosch;

public class Circulo {
    String nome;
    double raio;


    double calcArea(){
        return 3.14 * (raio * raio);

    }
    double calcPerimetro(){
        return 2 * 3.14 * raio;

    }
}