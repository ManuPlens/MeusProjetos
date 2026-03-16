package interface02;

public class Main {
  public static void main(String[] args) {
    TelevisaoSmart televisao = new TelevisaoSmart();

    televisao.ligar();
    televisao.conectarWifi();
    televisao.ExibirVoltagem();
    televisao.desligar();
  }
}
