public abstract class Conta {
  protected static final int AGENCIA_PADRAO = 1;
  protected static int SEQUENCIAL = 1;
  protected String tipo;

  protected int agencia;
  protected int numero;
  protected double saldo;

  public Conta() {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  public void imprimirExtrato() {
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));

  }
}
