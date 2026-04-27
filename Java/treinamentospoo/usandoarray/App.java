package treinamentospoo.usandoarray;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int[] numeros = new int[5];
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 5 números:");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = sc.nextInt();
    }
    sc.close();

    System.out.println("Números digitados: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    
  }
}
