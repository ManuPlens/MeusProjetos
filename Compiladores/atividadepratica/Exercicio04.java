package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio04 extends BaseExemplo {

@Override
public void executar() {
  String texto = "Maria tem 23 anos e comprou 5 livros por 120 reais.";
  String regex = "\\d+";

  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(texto);

  System.out.println("A String analisada é: " + texto);
  System.out.println("Números encontrados no texto:");

  while (matcher.find()) {
    System.out.println(matcher.group(0));
  }


}  
  
}
