package atividadepratica;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercicio07 extends BaseExemplo {

@Override
public void executar() {
String texto ="Cliente: João Silva\nCPF: 123.456.789-00";

String regex = "(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(texto);

String resultado = matcher.replaceAll("***.***.***-$4");

System.out.println("Texto original: " + texto);
System.out.println("Texto marcarado: " + resultado);

}

}
