import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite sua idade:");
     int numero = sc.nextInt();
     if (numero >= 18) {
        System.out.println("Você é maior de idade.");
     } else {
        System.out.println("Você é menor de idade.");
     }
     sc.close();  
     }
    }