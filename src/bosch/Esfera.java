package bosch;

public class Esfera {
    String nome;
    double raio;

    double calcVolume(){
        return 4 * 3.14 * (raio*raio*raio) / 3;
    }
    double calcAreaSup(){
        return 4 * 3.14 * (raio*raio);
    }
}