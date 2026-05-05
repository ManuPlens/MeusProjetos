package Dominio;

public class Token {
  private final TokenType tipo;
  private final String lexema;
  private final int posicao;
  private final int linha;

  public Token(TokenType tipo, String lexema,  int linha, int posicao) {
    this.tipo = tipo;
    this.lexema = lexema;
    this.linha = linha;
    this.posicao = posicao;
  }

  public TokenType getTipo() {
    return tipo;
  }

  public String getLexema() {
    return lexema;
  }

  public int getPosicao() {
    return posicao;
  }

  public int getLinha() {
    return linha;
  }

  @Override
  public String toString() {
    return "Token (tipo=[" + tipo + "]" + ", lexema=[" + lexema + "]" + ", posicao=[" + posicao + "], linha=[" + linha + "])";
  }
  
}
