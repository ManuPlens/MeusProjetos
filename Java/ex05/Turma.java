package ex05;

public class Turma {
  private Aluno[] alunos;
  private int quantidadeAlunos;

    public Turma(int tamanhoMaximo) {
      alunos = new Aluno[tamanhoMaximo];
      quantidadeAlunos = 0;
    }

    public Aluno[] getAlunos() {
      return alunos;
    }

     public void adicionarAluno(Aluno aluno) {
      if (quantidadeAlunos < alunos.length) {
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
      } else {
        System.out.println("Turma cheia! ");
      }
    }

    public void listarAlunos() {
      for (int i = 0; i < quantidadeAlunos; i++) {
        System.out.println(alunos[i].toString());
      }
    }

    public int getQuantidadeAlunos() {
      return quantidadeAlunos;
    }


    public void setQuantidadeAlunos(int quantidadeAlunos) {
      this.quantidadeAlunos = quantidadeAlunos;
    }

   

    public void printStatus(){
    System.out.println("Quantidade de alunos na turma: " + quantidadeAlunos);
  }
}
