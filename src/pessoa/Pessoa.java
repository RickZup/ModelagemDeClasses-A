package pessoa;

public class Pessoa {

    String nome;
    Integer idade;
    double altura;
    double peso;
    int anosQuepassaram;


    public Pessoa(String nome, Integer idade, double atura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = atura;
    }

    //ToDo Ver como aumentar a altura em 0,5 a cada ano que passar (sendo idade < 21)
    public void envelhecer(int anosQuepassaram){
        idade += anosQuepassaram;
    }

    public void engordar(double pesoQueGanhou){
        peso += pesoQueGanhou;
    }

    public void emagrecer(double pesoQuePerdeu){
        peso = peso - pesoQuePerdeu;
    }

    public void crescer(double quantoCresceu){
        altura += quantoCresceu;
    }

    public void dadosFisicos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

}
