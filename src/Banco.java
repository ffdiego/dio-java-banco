import java.util.ArrayList;
import java.util.List;

public class Banco {
  public String nome;
  public List<Conta> contas = new ArrayList<>();

  Banco(String nome) {
    this.nome = nome;
  }

  public void adicionarConta(Conta conta) {
    this.contas.add(conta);
  }

  public void imprimeContas() {
    System.out.println("-   Contas " + this.nome + "   -");
    try {
      for (Conta conta : this.contas) {
        System.out.println(String.format("(%s):%04d - R$%.2f", conta.tipo, conta.numero, conta.saldo));
      }
    } catch (NullPointerException e) {
      System.out.println("Nao ha contas registrados neste banco!");
    }
  }
}
