package bosch;

public class Cilindro {
    String nome;
    double h;
    double r;

    double calcVolume(){
        return 3.14 * (r * r) * h;
    }

    double calcAreaSup(){
        return (2 * 3.14) * h + (2 * 3.14) * (r * r);

    }
}

