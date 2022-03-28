package bosch;

public class Paralelepipedo {
    String nome;
    double comp;
    double larg;
    double alt;
    double a;
    double b;
    double c;

    double calcVolume(){
        return comp * alt * larg;
    }
    double calcAreaSup(){
        return 2 * (a*b) + 2 * (b*c) + 2 * (a*c);
    }
}
