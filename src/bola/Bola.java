package bola;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bola {


    String cor;
    String marca;
    String material;
    double velocidade;
    double circunferencia;

    Scanner entrada = new Scanner(System.in);

    public Bola(String cor, String marca, String material, double velocidade, double circunferencia) {
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
        this.circunferencia = circunferencia;
    }

    public void exibeFichaTecnica (){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Material: " + material);
        System.out.println("Velocidade máxima que pode atingir: " + velocidade + "km/h");
        System.out.println("Circunferência: " + circunferencia);
    }

    public void trocaCor (){
        System.out.println("--------------------------------------");
        System.out.println("Você quer trocar de cor?");
        System.out.println("Digite 'S' para 'Sim' ou 'N' para não.");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("s")){
            System.out.println("Para qual cor deseja mudar?");
            cor = entrada.nextLine();
            System.out.println("----------------------------");
            exibeFichaTecnica();
        } else if (resposta.equalsIgnoreCase("n")) {
            System.out.println("Tudo bem, deixemos como está!");
        } else {
            System.out.println("Resposta inválida!");
        }
    }

    public void mostraCor (){
        System.out.println(cor);
    }

}
