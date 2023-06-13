package quadrado;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado(5);

        quadrado1.mudarValorDoLado(10);
        quadrado1.retornarValorDoLado();
        quadrado1.calcularArea();
        quadrado1.informacoes();

    }
}
