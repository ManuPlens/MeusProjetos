public class Myclass {
  public static void main(String args[]) {
    Cavalo novo = new Cavalo ();
    novo.nome = "Relampago";

    System.out.println("Nome do cavalo = " + novo.nome);
    novo.nome = "McQueen";
    novo.printStatus(); 
  }
}
