package triangulo;

public class Triangulo {

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorDosLados(double novaBase, double novaAltura){
        base = novaBase;
        altura = novaAltura;
    }

    public double retornarValorDosLados(){
        return base;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public double calcularPerimetro(){
        return base + altura + altura;
    }
}
