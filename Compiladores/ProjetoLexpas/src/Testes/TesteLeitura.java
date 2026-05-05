package Testes;

import Exemplo.LeitorSemTratamento;

//import Exemplo.LeitorComTratamento;

public class TesteLeitura {
LeitorSemTratamento leitor = new LeitorSemTratamento();
//LeitorComTratamento leitor = new LeitorComTratamento();

 public void executar() {
  try {
     leitor.lerArquivo("exemplo.txt");
  } catch (Exception e) {
    e.printStackTrace();
   }
 }
}

