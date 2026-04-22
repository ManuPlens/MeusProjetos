package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio08 extends BaseExemplo{

  @Override
  public void executar() {
    String texto = "Telefone: (67) 99876-1234";
    String regex = "(\\(\\d{2}\\) 9)(\\d{4})(-\\d{4})";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);

    /* O método replaceAll usa referências aos grupos ($1, $2, $3):
       $1: Mantém o que foi capturado no Grupo 1 (DDD e o 9)
       ****: Substitui literalmente o conteúdo do Grupo 2
       $3: Mantém o que foi capturado no Grupo 3 (final do número)
    */
    String resultado = matcher.replaceAll("$1****$3");

    System.out.println("Texto original: " + texto);
    System.out.println("Texto com marcação: " + resultado);
  }
  
}
