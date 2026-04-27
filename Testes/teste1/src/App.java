import java.io.BufferedReader;
import java.io.FileReader;

public class App {
  public static void main(String[] args) {
    String caminhoArquivo = "teste1\\src\\teste.txt";

    try (FileReader fileReader = new FileReader(caminhoArquivo);
      BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
          System.out.println(linha);
        }
    } catch (Exception e) {
      System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }
  }
}
