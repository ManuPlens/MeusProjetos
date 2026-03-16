package projetoencontro5;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exemplo05 extends BaseExemplo {

  @Override
  public void executar() {
    String codigo = "int soma = a + 10;";

    System.out.println("A string analisada é: " + codigo);

    Map<String, String> tokens = new LinkedHashMap<>();

     tokens.put("PALAVRA_RESERVADA", "\\b(int|float|if|else|while)\\b");
     tokens.put("NUMERO", "\\b\\d+\\b");
     tokens.put("IDENTIFICADOR", "\\b[a-zA-Z_][a-zA-Z0-9_]*\\b");
     tokens.put("OPERADOR", "[+\\-*/=]");
     tokens.put("DELIMITADOR", "[;()]");

     String[] partes = codigo.split("\\s+");

       for (String parte : partes) {

            boolean encontrado = false;

            for (Map.Entry<String, String> token : tokens.entrySet()) {

                Pattern pattern = Pattern.compile(token.getValue());
                Matcher matcher = pattern.matcher(parte);

                if (matcher.matches()) {
                    System.out.println(token.getKey() + " → " + parte);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("TOKEN_DESCONHECIDO → " + parte);
            }
          }
        }
      }

  


