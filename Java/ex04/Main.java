package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);


  System.out.println("Digite um número:");
  int num1 = sc.nextInt();

  sc.nextLine(); 

  System.out.println("Digite outro número:");
  int num2 = sc.nextInt();

  System.out.println("A soma dos números é: " + (num1 + num2));
  System.out.println("A subtração dos números é: " + (num1 - num2));
  System.out.println("A multiplicação dos números é: " + (num1 * num2));
  System.out.println("A divisão dos números é: " + (num1 / num2));
  System.out.println("O resto da divisão dos números é: " + (num1 % num2));
   
  sc.close();

}
}