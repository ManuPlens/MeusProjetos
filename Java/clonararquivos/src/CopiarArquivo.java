import java.io.*;
import java.util.Scanner;
public class CopiarArquivo {
public static void main(String[] args) {
try {
Scanner sc = new Scanner(new File("clonararquivos/resources/dados.txt"));
FileWriter writer = new FileWriter("clonararquivos/resources/copia.txt", true);
while (sc.hasNextLine()) {
writer.write(sc.nextLine() + "\n");
}
sc.close();
writer.close();
} catch (Exception e) {
System.out.println("Erro: " + e.getMessage());
}
}
}