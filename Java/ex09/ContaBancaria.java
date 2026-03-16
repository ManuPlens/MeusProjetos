package ex09;

public class ContaBancaria {
  String titular;
  int numerodaconta;
  double saldo;

  public ContaBancaria(String titular, int numerodaconta) {
    this.titular = titular;
    this.numerodaconta = numerodaconta;
    this.saldo = 0;
  }
  
  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public int getNumerodaconta() {
    return numerodaconta;
  }

  public void setNumerodaconta(int numerodaconta) {
    this.numerodaconta = numerodaconta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    double saldo = getSaldo();
    setSaldo(saldo + valor);
    System.out.println("Depositado com sucesso: R$ " + valor);
  }
  public boolean sacar(double valor) {
    if (saldo < valor) {
      return false;
    } else {
      setSaldo(saldo - valor);
      return true;
    }
  }
}
