package interface02;

public class TelevisaoSmart implements Eletronico, Conectavel {
  @Override
  public void ligar() {
    System.out.println("A televisão está ligada!!!!");
  }

  @Override
  public void desligar() {
    System.out.println("A televisão está desligada!!!");
  }

  @Override
  public void conectarWifi() {
    System.out.println("A televisão está conectada no wifi!!");

  }

}
  




