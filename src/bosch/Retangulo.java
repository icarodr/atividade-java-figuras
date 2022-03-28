package bosch;

public class Retangulo {
    String nome;
    double base;
    double altura;

    double calcArea(){
        return base * altura;
    }
    double calcPerimetro(){
        return 2 * (base + altura);
    }
}
