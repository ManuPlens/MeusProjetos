package projetoencontro5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exemplo02 extends BaseExemplo {

@Override
public void executar() {
  String texto = "João tem 25 anos e comprou 3 livros por 120 reais.";
  String regex = "\\d+";

Pattern pattern = Pattern.compile(regex);

Matcher matcher = pattern.matcher(texto);

System.out.println("A string analisada é: " + texto);
System.out.println("Números encontrados no texto:");

while (matcher.find()) {
  System.out.println(matcher.group());
}

}
  
}
