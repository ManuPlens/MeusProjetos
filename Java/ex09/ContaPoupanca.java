package ex09;

public class ContaPoupanca extends ContaCorrente {
  int taxaRendimento;
  public ContaPoupanca(String titular, int numerodaconta) {
    super(titular, numerodaconta);
    this.limite = 0; 
    this.taxaRendimento = 5; 
  }
  public double calcularRendimento() {
    return saldo * (taxaRendimento / 100.0);
}
}