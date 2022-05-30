package dio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente();
        jessica.setNome("Jéssica");


        Conta cc = new ContaCorrente(jessica);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(jessica);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
