package ProjetoCifra.Engine;

public class CifraVigenere {
  private String CHAVE = "UNIDERP";

  public CifraVigenere() {
    super();
    CHAVE = "UNIDERP";
  }
  public CifraVigenere(String chave) {
    super();
    CHAVE = chave;
  }

  public String cifrar(String palavra) {
    StringBuilder resultado = new StringBuilder();
    String texto = palavra.toUpperCase();
    String chave = CHAVE.toUpperCase();

    int indiceChave = 0;
    for (int i = 0; i < texto.length(); i++) {
      char c = texto.charAt(i);
      if (c >= 'A' && c <= 'Z') {
        int p = c - 'A';
        int k = chave.charAt(indiceChave) - 'A';

        int cifrado = (p + k) % 26;
        resultado.append((char) (cifrado + 'A'));

        indiceChave = (indiceChave + 1) % chave.length();
      } else {
        resultado.append(c);
      }
    }
    return resultado.toString();
  }

  public String decifrar(String palavra) {
    StringBuilder resultado = new StringBuilder();
    String texto = palavra.toUpperCase();
    String chave = CHAVE.toUpperCase();

    int indiceChave = 0;
    for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                int p = c - 'A';
                int k = chave.charAt(indiceChave) - 'A';

                int decifrado = (p - k + 26) % 26;
                resultado.append((char) (decifrado + 'A'));
                indiceChave = (indiceChave + 1) % chave.length();
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}
  






