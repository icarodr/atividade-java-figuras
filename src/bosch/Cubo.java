package bosch;

public class Cubo {
    String nome;
    double aresta;
    double aresta2;
    double aresta3;

    double calcVolume(){
        return aresta*aresta2*aresta3;
    }
    double calcAreaSup(){
        return 6 * aresta * aresta;
    }
}
