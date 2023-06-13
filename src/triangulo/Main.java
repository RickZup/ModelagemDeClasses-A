package triangulo;

public class Main {

    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(5, 6);

        triangulo1.mudarValorDosLados(6, 7);
        triangulo1.retornarValorDosLados();

        System.out.println("Valor da área: " + triangulo1.calcularArea());
        System.out.println("Valor do perímetro: " + triangulo1.calcularPerimetro());

    }

}
