package interface03;

public class Bicicleta implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("Pedalando com a bicicleta!");
  }

  @Override 
  public void frear() {
    System.out.println("Freando a bicicleta!");

  }
} 
 

