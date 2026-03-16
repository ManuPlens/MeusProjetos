package interface02;

public interface Eletronico {
 
  void ligar();
  void desligar();

  default void ExibirVoltagem() {
    System.out.println("Esse aparelho é Bivolt (110/220v).");
  }

}
