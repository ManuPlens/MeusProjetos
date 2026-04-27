import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite um número:");
      int numero1 = sc.nextInt();

      System.out.println("Digite outro número:");
      int numero2 = sc.nextInt();
      
      System.out.println("O primeiro número é: " + numero1);
      System.out.println("O segundo número é: " + numero2);
      sc.close();


      System.out.println("\nA soma deles é: " + (numero1 +  numero2));
      System.out.println("\nA subtração deles é: " + (numero1 - numero2));
      System.out.println("\nA multiplicação deles é: " + (numero1 * numero2));
      System.out.println("\nA divisão deles é: " + (numero1 / numero2));
      
    }
}
