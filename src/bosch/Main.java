package bosch;

public class Main {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.nome = "Quadrado";
        q1.lado = 5;
        System.out.print("\n==="+q1.nome+"===");
        System.out.print("\nA área do Quadrado é: " + q1.calcaArea());
        System.out.print("\nO Perímetro do Quadrado é: " + q1.calcPerimetro());

        Circulo c1 = new Circulo();
        c1.nome = "Circulo";
        c1.raio = 5;
        System.out.print("\n\n==="+c1.nome+"===");
        System.out.print("\nA área do círculo é: " + c1.calcArea());
        System.out.print("\nO Perímetro do Circulo é: " + c1.calcPerimetro());

        Triangulo t1 = new Triangulo();
        t1.nome = "Triangulo";
        t1.lado = 5;
        System.out.print("\n\n==="+t1.nome+"===");
        System.out.print("\nA área do Triangulo é: " + t1.calcArea());
        System.out.print("\nO Perímetro do Triangulo é: " + t1.calcPerimetro());

        Hexagono h1 = new Hexagono();
        h1.nome = "Hexagono";
        h1.lado = 5;
        System.out.print("\n\n==="+h1.nome+"===");
        System.out.print("\nA área do Hexagono é: " + h1.calcArea());
        System.out.print("\nO Perímetro do Hexagono é: " + h1.calcPerimetro());

        Retangulo r1 = new Retangulo();
        r1.nome = "Retângulo";
        r1.altura = 5;
        r1.base = 5;
        System.out.print("\n\n==="+r1.nome+"===");
        System.out.print("\nA área do Retângulo é: " + r1.calcArea());
        System.out.print("\nO Perímetro do Retângulo é: " + r1.calcPerimetro());

        Cubo k1 = new Cubo();
        k1.nome = "Cubo";
        k1.aresta = 5;
        k1.aresta2 = 5;
        k1.aresta3 = 5;
        System.out.print("\n\n==="+k1.nome+"===");
        System.out.print("\nO Volume do Cubo é: "+k1.calcVolume());
        System.out.print("\nA Area Superficial do Cubo é: "+k1.calcAreaSup());

        Esfera e1 = new Esfera();
        e1.nome = "Esfera";
        e1.raio = 5;
        System.out.print("\n\n==="+e1.nome+"===");
        System.out.print("\nO Volume da Esfera é: "+e1.calcVolume());
        System.out.print("\nA Area Superficial da Esfera é: "+e1.calcAreaSup());

        Cilindro cil1 = new Cilindro();
        cil1.nome = "Cilindro";
        cil1.h = 5;
        cil1.r = 5;
        System.out.print("\n\n==="+cil1.nome+"===");
        System.out.print("\nO Volume do Cilindro é: "+cil1.calcVolume());
        System.out.print("\nA Area Superficial do Cilindro é: "+cil1.calcAreaSup());

        Cone co1 = new Cone();
        co1.nome = "Cone";
        co1.g = 5;
        co1.r = 5;
        co1.h = 5;
        System.out.print("\n\n==="+co1.nome+"===");
        System.out.print("\nO Volume do Cone é: "+co1.calcVolume());
        System.out.print("\nA Area Superficial do Cone é: "+co1.calcAreaSup());

        Paralelepipedo pa1 = new Paralelepipedo();
        pa1.nome = "Paralelepípedo";
        pa1.comp = 5;
        pa1.larg = 5;
        pa1.a = 5;
        pa1.b = 5;
        pa1.c = 5;
        pa1.larg = 5;
        System.out.print("\n\n==="+pa1.nome+"===");
        System.out.print("\nO Volume do Paralelepípedo é: "+pa1.calcVolume());
        System.out.print("\nA Area Superficial do Paralelepípedo é: "+pa1.calcAreaSup());

        
    }
}