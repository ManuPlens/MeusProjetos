package Testes;
import Mecanismo.LeituraArquivo;
import Mecanismo.BufferPrimario;

public class TesteBufferPrimario {
  public static void executar() {
    LeituraArquivo leitura = new LeituraArquivo();
    leitura.carregarArquivoParaLeitor("C:\\Users\\Emanuelly\\Documents\\MeusProjetos\\Compiladores\\projeto\\src\\programa.pas");
    leitura.importarDadosParaLeitor();

    BufferPrimario bfp = new BufferPrimario(leitura.getLeitor());
    bfp.processarDadosDoBufferPrimario();
    bfp.imprimirConteudoDoBufferPrimario(true);
  }
}
