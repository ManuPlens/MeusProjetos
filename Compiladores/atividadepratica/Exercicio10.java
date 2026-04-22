package atividadepratica;

import java.util.regex.Pattern;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;

public class Exercicio10 extends BaseExemplo {

    @Override
    public void executar() {
        
        String texto = "a != 10 b <= 20 c >= 30";

        System.out.println("A string analisada é: " + texto);

       // Define a ordem de prioridade dos tokens usando um LinkedHashMap
       // A ordem de inserção importa para evitar que um IDENTIFICADOR capture uma PALAVRA_RESERVADA
        Map<String, String> tokens = new LinkedHashMap<>();
        
        //Definição dos padrões (Regex) para cada tipo de componente léxico
        tokens.put("PALAVRA_RESERVADA", "(int|float|if|else|while)");
        tokens.put("NUMERO", "\\d+");
        tokens.put("IDENTIFICADOR", "[a-zA-Z_][a-zA-Z0-9_]*");
        tokens.put("OPERADOR", "(==|!=|>=|<=|&&|\\|\\||[+\\-*/=<>&!])");
        tokens.put("DELIMITADOR", "[;(){}]");

        // Divide o texto de entrada em partes baseando-se nos espaços em branco
        // O regex "\\s+" trata espaços, tabulações e quebras de linha como separadores primários
        String[] partes = texto.split("\\s+");

       // Laço principal: Itera sobre cada "pedaço" de texto separado por espaço
        for (String parte : partes) {
            boolean encontrado = false;

            // Tenta encontrar correspondência para cada padrão definido no Map
            for (Map.Entry<String, String> token : tokens.entrySet()) {
                // Compila o padrão Regex atual
                Pattern pattern = Pattern.compile(token.getValue());
                Matcher matcher = pattern.matcher(parte);

                // Enquanto encontrar o padrão dentro da string atual
                while (matcher.find()) {
                    // Imprime o tipo do token (chave do Map) e o valor real encontrado
                    System.out.println(token.getKey() + " → " + matcher.group());
                    encontrado = true;
                }
            }
            // Caso o texto não corresponda a nenhuma regra definida (ex: caracteres inválidos)
            if (!encontrado) {
                System.out.println("TOKEN_DESCONHECIDO → " + parte);
            }
        }
    }
}