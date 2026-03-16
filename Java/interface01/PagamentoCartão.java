package interface01;

public class PagamentoCartão implements Pagavel {

  @Override 
  public void realizarPagamento(double valor) {
    System.out.println("Pagamento de R$ " + valor + " realizado com cartão.")  ; 
  }
}