package ex07;

public class Moto extends Veiculo {
  int cilindradas;
  
  public Moto(String marca, int ano, int cilindradas) {
    super(marca, ano);
    this.cilindradas = cilindradas;
  }
  
  public int getCilindradas() {
    return cilindradas;
  }
  
  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }
  
  @Override
  public String exibirInfo() {
    return "Moto [marca=" + marca + ", ano=" + ano + ", cilindradas=" + cilindradas + "]";
  }

}