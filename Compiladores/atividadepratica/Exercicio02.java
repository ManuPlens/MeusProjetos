package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio02 extends BaseExemplo {

@Override
public void executar() {
  String texto = "000,53423";
  String regex = "^[+-]?\\d+[.,]\\d+$";

  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(texto);

  System.out.println("A string analisada é: " + texto);
  if (matcher.matches()) {
    System.out.println("a string tem números decimais");
  } else {
    System.out.println("Não contem apenas números decimais!!");
  }
}  
}