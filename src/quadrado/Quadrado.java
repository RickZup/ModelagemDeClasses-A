package quadrado;

public class Quadrado {

    double tamanhoDoLado;

    public Quadrado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarValorDoLado(double novoValor){
        tamanhoDoLado = novoValor;
    }

    public double retornarValorDoLado(){
        return tamanhoDoLado;
    }

    public double calcularArea(){
        return tamanhoDoLado * tamanhoDoLado;
    }

    public void informacoes (){
        System.out.println("Tamanho do lado: " + tamanhoDoLado);
        System.out.println("Valor da área: " + calcularArea());
    }

}
