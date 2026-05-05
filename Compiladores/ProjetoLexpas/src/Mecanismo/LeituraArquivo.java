package Mecanismo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {
  private String caminhoDoArquivo;


  public String getCaminhoDoArquivo() {
    return caminhoDoArquivo;
  }
  

  private BufferedReader leitor;


  public BufferedReader getLeitor() {
    return leitor;
  }

  public void carregarArquivoParaLeitor() {
    System.out.println( "###Carregar arquivo para teste###");
    Scanner scan = new Scanner(System.in);
    System.out.print("Informe o diretório: ");
    String diretorio = scan.next();
    System.out.print("Informe o nome do arquivo: ");
    String nomeArquivo = scan.next();
    this.caminhoDoArquivo = diretorio + "/" + nomeArquivo;
    scan.close();
  }

  public void carregarArquivoParaLeitor(String caminhoCompleto) {
    this.caminhoDoArquivo = caminhoCompleto;
  }

  public void importarDadosParaLeitor() {
    this.leitor = null;
    try {
      this.leitor = new BufferedReader(new FileReader(this.caminhoDoArquivo));
    } catch (IOException e) {
      System.err.println("Erro ao ler o arquivo:");
      System.err.println(e);
    }
  }
//IOException é uma classe de exceção que ocorre durante operações de entrada/saída, como leitura ou escrita em arquivos. Ela é lançada quando há um problema ao acessar um arquivo, ele lê todo o erro, se usasse o e.getMessage() ele só leria a mensagem de erro, e não o stack trace completo, que é útil para depuração.

}
