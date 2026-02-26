package ex05;

public class Main {
  public static void main(String[] args) {

    Turma loo = new Turma(3); 
    Aluno aluno1 = new Aluno("Emanuelly", 20, "12345"); 
    
    loo.adicionarAluno(aluno1);
    loo.listarAlunos();

  }
}
