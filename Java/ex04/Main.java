package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);


  System.out.println("Digite sua idade:");
  int idade = sc.nextInt();

  sc.nextLine(); 

  System.out.println("Digite seu nome:");
  String nome = sc.nextLine();

  

  System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
   
  sc.close();

}
}