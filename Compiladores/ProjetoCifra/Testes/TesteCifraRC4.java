package ProjetoCifra.Testes;

import ProjetoCifra.Engine.CifraRC4;

public class TesteCifraRC4 {
  public static void executar() {
    CifraRC4 algoritmo = new CifraRC4("TESTE");
    String originalStr = "COMPILADORES";
    byte [] originalBytes = originalStr.getBytes();

    byte[] cifrado = algoritmo.processar(originalBytes);

    byte[] decifradoBytes = algoritmo.processar(cifrado);
    String resultadoFinal = new String(decifradoBytes);
    System.out.println("Original: " + originalStr);
    System.out.println("Cifrado (Hex): " + bytesParaHex(cifrado));
    System.out.println("Decifrado: " + resultadoFinal);
   }

   private static String bytesParaHex(byte[] bytes) {
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
      sb.append(String.format("%02x ", b));
    }
    return sb.toString();
   }
}
