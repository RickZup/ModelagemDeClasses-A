package triângulo;

public class Triangulo {

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorDosLados(double novoValor){
        base = novoValor;
        altura = novoValor;
    }

}
