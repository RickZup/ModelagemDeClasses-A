package bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("--------------- BOLA NOVA ---------------");
        Bola bolaNova = new Bola(
                "Azul", "Nike",
                "60% borracha, 15% poliuretano, 13% poliéster e 12% EVA-Importado",
                129, 70);

        bolaNova.exibeFichaTecnica();
        bolaNova.trocaCor();
        System.out.println();

        System.out.println("--------------- BOLA ANTIGA ---------------");
        Bola bolaAntiga = new Bola("Laranja", "Adiddas",
                "Borracha", 95, 68);

        bolaAntiga.exibeFichaTecnica();
        bolaAntiga.trocaCor();
        System.out.println();

        System.out.println("--------------- FUTURA BOLA ---------------");
        Bola futuraBola = new Bola("Verde", "Wilson",
                "Pedra", 184, 69);

        futuraBola.exibeFichaTecnica();
        futuraBola.trocaCor();
    }
}
