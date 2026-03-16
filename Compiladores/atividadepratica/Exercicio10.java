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

        Map<String, String> tokens = new LinkedHashMap<>();

        tokens.put("PALAVRA_RESERVADA", "(int|float|if|else|while)");
        tokens.put("NUMERO", "\\d+");
        tokens.put("IDENTIFICADOR", "[a-zA-Z_][a-zA-Z0-9_]*");
        
        tokens.put("OPERADOR", "(==|!=|>=|<=|&&|\\|\\||[+\\-*/=<>&!])");
        
        tokens.put("DELIMITADOR", "[;(){}]");

        String[] partes = texto.split("\\s+");

        for (String parte : partes) {
            boolean encontrado = false;

            for (Map.Entry<String, String> token : tokens.entrySet()) {
                Pattern pattern = Pattern.compile(token.getValue());
                Matcher matcher = pattern.matcher(parte);

                while (matcher.find()) {
                    System.out.println(token.getKey() + " → " + matcher.group());
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("TOKEN_DESCONHECIDO → " + parte);
            }
        }
    }
}