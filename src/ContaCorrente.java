public class ContaCorrente extends Conta {

  public ContaCorrente() {
    super();
    this.tipo = "Corrente";
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirExtrato();
  }
}
