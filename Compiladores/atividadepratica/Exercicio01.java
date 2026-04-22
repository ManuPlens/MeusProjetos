package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio01 extends BaseExemplo{

 @Override
 public void executar(){
  String texto = "12345";
  String regex = "^\\d+$";

  // Compila a regex em um objeto Pattern para otimizar a busca
  Pattern pattern = Pattern.compile(regex);
  // Cria o Matcher, que aplicará o padrão (pattern) sobre o texto alvo
  Matcher matcher = pattern.matcher(texto);

  System.out.println("A string analisada é: " + texto);
  // O método matches() verifica se toda a string corresponde ao padrão definido
  if (matcher.matches()) {
    System.out.println("A string contém apenas números");
  } else {
    System.out.println("A string também contém caracteres");
  }

 } 
  
}
