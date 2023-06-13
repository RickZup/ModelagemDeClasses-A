package pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Ricardo", 15, 1.60);
        pessoa1.peso = 55;

        pessoa1.envelhecer(0);
        pessoa1.engordar(0);
        pessoa1.emagrecer(0);
        pessoa1.crescer(0);

        pessoa1.dadosFisicos();

    }
}
