package Mecanismo;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

public class BufferPrimario {
  private BufferedReader leitor;

  private ArrayList<String> bufferPrimario;

  public ArrayList<String> getBufferPrimario() {
    return bufferPrimario;
  }
  
  public BufferPrimario(BufferedReader leitor) {
    this.leitor = leitor;
  }

  public void processarDadosDoBufferPrimario() {
    this.bufferPrimario = new ArrayList<>();
    try {
      String linha;
      while ((linha = this.leitor.readLine()) != null) {
        bufferPrimario.add(linha);
      }
    } catch (IOException e) {
      System.err.println("Erro ao processar o buffer primário:");
      System.err.println(e);
    } finally {
     if (this.leitor != null) {
        try {
          this.leitor.close();
        } catch (IOException e) {
          System.err.println(e);
        }
     }
    }
  }
  public void imprimirConteudoDoBufferPrimario(Boolean flag) {
    if (flag) {
      System.out.println("###Conteúdo do Buffer Primário###");
      for (String texto : this.bufferPrimario) {
        System.out.println(texto);
      }
    }
  }
}
