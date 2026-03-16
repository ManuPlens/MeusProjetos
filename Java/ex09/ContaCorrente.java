package ex09;

public class ContaCorrente extends ContaBancaria {
 int limite;
  public ContaCorrente(String titular, int numerodaconta) {
    super(titular, numerodaconta);
    this.limite = 1000; 
  }
 
  @Override
  public boolean sacar(double valor) {
    if (saldo + limite >= valor) {
      saldo -= valor;
    } else {
      System.out.println("Saldo insuficiente para saque, considerando o limite.");  
}
    return false;
  }
}
