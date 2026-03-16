package ex07;

public class Carro extends Veiculo {
  int quantidadePortas;
  
  public Carro(String marca, int ano, int quantidadePortas) {
    super(marca, ano);
    this.quantidadePortas = quantidadePortas;
  }
  
  public int getQuantidadePortas() {
    return quantidadePortas;
  }
  
  public void setQuantidadePortas(int quantidadePortas) {
    this.quantidadePortas = quantidadePortas;
  }
  @Override
  public String exibirInfo() {
    return "Carro [marca=" + marca + ", ano=" + ano + ", quantidadePortas=" + quantidadePortas + "]";
  }
  
}
