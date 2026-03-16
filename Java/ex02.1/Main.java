// Atividade Lista de Poo
package ex02;

public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro("Delorean", "DMC-12", 1981);
    Carro carro2 = new Carro("Honda", "Civic", 2006);

     System.out.println("--- Dados Iniciais ---");
        System.out.println("Carro 1: " + carro1.exibirInformacoes());
        System.out.println("Carro 2: " + carro2.exibirInformacoes());

    carro1.setAno(1982);
    System.out.println("\nAno atualizado do carro 1: " + carro1.getAno());
  }
  
}
