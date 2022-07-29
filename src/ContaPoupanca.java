public class ContaPoupanca extends Conta {

  public ContaPoupanca() {
    super();
    this.tipo = "Poupanca";
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupanca ===");
    super.imprimirExtrato();
  }
}
