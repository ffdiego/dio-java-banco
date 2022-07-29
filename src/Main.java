public class Main {
  public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    Conta cc2 = new ContaCorrente();
    Conta poupanca = new ContaPoupanca();

    cc.depositar(666.66);
    poupanca.depositar(100);

    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    cc2.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}
