package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio01 extends BaseExemplo{

 @Override
 public void executar(){
  String texto = "12345";
  String regex = "^\\d+$";

  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(texto);

  System.out.println("A string analisada é: " + texto);
  if (matcher.matches()) {
    System.out.println("A string contém apenas números");
  } else {
    System.out.println("A string também contém caracteres");
  }

 } 
  
}
