package bosch;

public class Cone {
    String nome;
    double h;
    double r;
    double g;
    double calcVolume(){
       return 3.14 * (r * r) * h / 3;
    }
    double calcAreaSup(){
        return (3.14 * r) * (r + g);
    }
}

// A = π · r (r + g)