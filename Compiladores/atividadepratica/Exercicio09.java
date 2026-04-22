package atividadepratica;

import java.util.regex.Pattern;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;

public class Exercicio09 extends BaseExemplo {

    @Override
    public void executar() {
        String texto = "float valor = num1 + (num2 * 10);";

        System.out.println("A string analisada é: " + texto);

        /* o LinkedHashMap serve para definir as regras dos tokens.
       O LinkedHashMap mantém a ordem de inserção, o que é vital aqui:
       queremos testar "PALAVRA_RESERVADA" antes de "IDENTIFICADOR", 
       senão 'float' seria classificado apenas como um nome comum.
    */
        Map<String, String> tokens = new LinkedHashMap<>();

        tokens.put("PALAVRA_RESERVADA", "(int|float|if|else|while)");
        tokens.put("NUMERO", "\\d+");
        tokens.put("IDENTIFICADOR", "[a-zA-Z_][a-zA-Z0-9_]*");
        tokens.put("OPERADOR", "[+\\-*/=]");
        tokens.put("DELIMITADOR", "[;()]");

        /* Divide a string inicial por espaços em branco (\\s+).
       Isso quebra a frase em "palavras" individuais para facilitar a análise.
    */
        String[] partes = texto.split("\\s+");
        // Loop externo: percorre cada "palavra" separada pelo split
        for (String parte : partes) {
            boolean encontrado = false;
            // Loop interno: testa a "palavra" contra cada padrão de token definido no Map
            for (Map.Entry<String, String> token : tokens.entrySet()) {
                Pattern pattern = Pattern.compile(token.getValue());
                Matcher matcher = pattern.matcher(parte);

               /* Enquanto encontrar um padrão dentro da 'parte'. 
               O find() é usado aqui porque uma parte pode ter vários tokens grudados, 
               como "(num2" (que tem DELIMITADOR e IDENTIFICADOR).
            */
                while (matcher.find()) {
                    System.out.println(token.getKey() + " → " + matcher.group());
                    encontrado = true;
                }
            }
            // Se nenhum padrão do nosso Map serviu para a palavra
            if (!encontrado) {
                System.out.println("TOKEN_DESCONHECIDO → " + parte);
            }
        }
    }
}
  

