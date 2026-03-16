package interface01;

public class PagamentoPix implements Pagavel {

  @Override
   public void realizarPagamento(double valor) {
    System.out.println("Pagamento de R$ " + valor + " realizado com pix.");
   }
}
