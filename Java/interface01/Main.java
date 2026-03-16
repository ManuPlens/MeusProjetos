package interface01;

public class Main {
  
  public static void main(String[] args) {
    Pagavel PagamentoCartão = new PagamentoCartão();
    PagamentoCartão.realizarPagamento(100.0);

    Pagavel PagamentoPix = (Pagavel) new PagamentoPix();
    PagamentoPix.realizarPagamento(50.0);

    
  }
}
