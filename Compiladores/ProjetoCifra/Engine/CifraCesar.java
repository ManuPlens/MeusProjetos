package ProjetoCifra.Engine;

public class CifraCesar {
  private int CHAVE;

  public CifraCesar(int chave) {
    CHAVE = chave;
    super();
  }
  public CifraCesar() {
    CHAVE = 3;
    super();
  }
  public String cifrar(String palavra) {
    StringBuilder resultado = new StringBuilder();
    String textoParaProcessar = palavra.toUpperCase();
    for (int i = 0; i < textoParaProcessar.length(); i++) {
      char caractereOriginal = textoParaProcessar.charAt(i);
      if (caractereOriginal >= 'A' && caractereOriginal <= 'Z') {
        int posicaoOriginal = caractereOriginal - 'A';
        int novaPosicao = (posicaoOriginal + CHAVE) % 26;
        char caractereCifrado = (char) ('A' + novaPosicao);

        resultado.append(caractereCifrado);
      } else {
        resultado.append(caractereOriginal);
      }
    }
    return resultado.toString();
  }
  

  public String decifrar(String palavra) {
    StringBuilder resultado = new StringBuilder();
    String textoParaProcessar = palavra.toUpperCase();
    for (int i = 0; i <  textoParaProcessar.length(); i++) {
      char caractereCifrado = textoParaProcessar.charAt(i);
      if (caractereCifrado >= 'A' && caractereCifrado <= 'Z') {
        int posicaoCifrada = caractereCifrado - 'A';
        int novaPosicao = (posicaoCifrada - CHAVE + 26) % 26;
        char caractereOriginal = (char) ('A' + novaPosicao);

        resultado.append(caractereOriginal);
    
      } else {
        resultado.append(caractereCifrado);
      }
    }
    return resultado.toString();
  }
}
