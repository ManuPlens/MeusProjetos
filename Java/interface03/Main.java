package interface03;

public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    Bicicleta bicicleta1 = new Bicicleta();

    carro1.acelerar();
    carro1.frear();
    carro1.abastecer();

    bicicleta1.acelerar();
    bicicleta1.frear();
  }
  
}
