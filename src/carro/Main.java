package carro;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro(4, "Logan", "Renoult", 2);

        meuCarro.exibirDados();
        System.out.println("----------------");
        meuCarro.ligarCarro();

    }

}
