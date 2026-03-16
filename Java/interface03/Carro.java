package interface03;

public class Carro implements VeiculoMotorizado {
  
  @Override
  public void acelerar() {
    System.out.println("Acelerando o carro!");
  }

  @Override 
  public void frear() {
    System.out.println("Freando o carro!");

  }

  @Override
  public void abastecer() {
    System.out.println("Abastecendo o carro!");
  }

}
