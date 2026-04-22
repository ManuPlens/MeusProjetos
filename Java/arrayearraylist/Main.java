package arrayearraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // Array estático: fixo de 3 posições
    String[] nomes = new String[3];
    nomes[0] = "Manu";
    nomes[1] = "Vitor";
    nomes[2] = "Gabriel";
   
    // ArrayList dinamico: ArrayList<tipo> nome = new ArrayList<tipo>();

    ArrayList<String> nomess = new ArrayList<String>();
    nomess.add("Manu");
    nomess.add("Fernanda");
    nomess.add("Vitor");
    nomess.add("Gabriel");
    nomess.add("Lucas");
    nomess.add("Mateus");

    System.out.println("Nomes em Array estático:");
    for (int i = 0; i < nomes.length; i ++) {
       System.out.println(nomes[i]);
    }

    System.out.println("\nNomes em Array Dinâmico:");
    for (int i = 0; i < nomess.size(); i++){
      System.out.println(nomess.get(i));
  }

   System.out.println("\nImprimir só a terceira posição do Array: " + nomes[2]);
   System.out.println("\nImprimir só a primeira posição do Array: " + nomes[0]);
   System.out.println("\nImprimir só a quinta posição do Arraylist: " + nomess.get(4));
   System.out.println("\nImprimir só a terceira posição do Arraylist: " + nomess.get(2));
  

   System.out.println("\nRemover o Mateus do Arraylist...");
   nomess.remove(5);

   System.out.println("\nImprimindo sem o Mateus:");
    for (int i = 0; i < nomess.size(); i++){
      System.out.println(nomess.get(i));
  }

  System.out.println("\nLimpando o Arraylist...");
  nomess.clear();

  System.out.println("\nLista Limpa:");
     for (int i = 0; i < nomess.size(); i++){
      System.out.println(nomess.get(i));
  }
  System.out.println(nomess.size());

  System.out.println("Criando novo ArrayList...");

  ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(1);
    numeros.add(-23);
    numeros.add(10);
    numeros.add(54);

    // sort = ordenar
    Collections.sort(numeros);

    // Se fosse decrescente seria: Collections.sort(numeros, Collections.reverseOrder());
   
    System.out.println("\nImprimindo os números na crescente:");
    for (int i = 0; i < numeros.size(); i++){
      System.out.println(numeros.get(i));
  } 
}
}


//Para o ArrayList usar a biblioteca: java.util.ArrayList;
//Para adicinar um objeto no array: .add
//Para remover: .remove
//Para limpar o array: .clear
//Para imprimir: .get
//Wrapper class: É uma classe que transforma um tipo primitivo (int, double) em um Objeto.
//ArrayList só aceita Wrapper Class:
//    int --> Integer
//    double --> Double
//    float --> Float
//    char --> Character
//    boolean --> Boolean
//    byte --> Byte

//Para colocar Arraylist em ordem crescente ou decrescente usar a biblioteca: java.util.Collections;
//Ordenar em forma Crescente: Collections.sort(numeros);
//Ordenar em forma Decrescente: Collections.sort(numeros, Collections.reverseOrder());