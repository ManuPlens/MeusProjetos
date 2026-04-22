package arrayearraylist.testandoobjeto;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Pessoa joao = new Pessoa("Joâo Vitor", 20);
    Pessoa augusto = new Pessoa("Augusto ", 24);
    Pessoa seidy = new Pessoa("Seidy", 19);


    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    pessoas.add(joao);
    pessoas.add(augusto);
    pessoas.add(seidy);

    for (int i = 0; i < pessoas.size(); i++) {
      System.out.println(pessoas.get(i));
    }
  }
}
