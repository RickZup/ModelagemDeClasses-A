package carro;

public class Carro {

    int quantidadeDePortas;
    String modelo;
    String marca;
    double potencia;

    public Carro(int quantidadeDePortas, String modelo, String marca, double potencia) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void ligarCarro(){
        System.out.println("Carro ligado!");
    }

    public void exibirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade de portas: " + quantidadeDePortas);
        System.out.println("Potência: " + potencia);
    }


}
