package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio03 extends BaseExemplo {
 
@Override
public void executar() {
   String texto = "05/01/2004"; 
   String regex = "(\\d{2})/(\\d{2})/(\\d{4})";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);

    System.out.println("A string analisada é: " + texto);
    if (matcher.matches()) {
    System.out.println("Data válida");
  } else {
    System.out.println("Data inválida, não esta no formato DD/MM/AAAA");
  }

    }

} 

  

