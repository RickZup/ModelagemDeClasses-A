package contaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente minhaConta = new ContaCorrente("0612", "Ricardo dos Santos");
        minhaConta.saldo = 3000;

        minhaConta.depositoConta(0);
        minhaConta.saqueConta(1000);

        minhaConta.exibirDados();

    }
}
