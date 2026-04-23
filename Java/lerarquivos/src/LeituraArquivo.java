import java.io.File;
import java.util.Scanner;

public class LeituraArquivo {
public static void main(String[] args) { 
  
try {  
  File arquivo = new File("lerarquivos/resources/dados.txt");
  Scanner sc = new Scanner(arquivo);
  while (sc.hasNextLine()) {
    String linha = sc.nextLine();
    System.out.println(linha);
}
  sc.close(); } 
catch (Exception e) {
  System.out.println("Erro: " + e.getMessage());
  } 
}
}