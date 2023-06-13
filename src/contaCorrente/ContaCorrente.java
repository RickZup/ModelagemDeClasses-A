package contaCorrente;

public class ContaCorrente {

    String conta;
    String nomeDoCorrentista;
    double saldo;

    public ContaCorrente(String conta, String nomeDoCorrentista) {
        this.conta = conta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public void depositoConta(double valorDeposito){
        saldo += valorDeposito;
    }

    public void saqueConta (double valorSaque){
        saldo -= valorSaque;
    }

    public void exibirDados (){
        System.out.println("Número da conta: " + conta);
        System.out.println("Nome do correntista: " + nomeDoCorrentista);
        System.out.printf("Saldo: %.2f", saldo);
    }

}
