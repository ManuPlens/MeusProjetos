package ProjetoCifra;

import ProjetoCifra.Desafio.*;

public class App {
  public static void main (String[] args) throws Exception {
    System.out.println("=================== Solução do Mistério ===================");
    String local = Decifrador.decifrarCesar("JSYWFIF", 5);
    System.out.println("Local do crime: " + local);

    String horario = Decifrador.decifrarVigenere("U_ZMLE_R_CIVBH", "UNIDERP");
    System.out.println("Horário: " + horario);

    String objeto = Decifrador.decifrarRC4("C8 28 BB FE 97 9D 8B E7 F0 C4 8E 9C", local);
    System.out.println("Objeto do crime: " + objeto);

  }
}
