import java.util.Objects;

public class Aluno extends PessoaFisica implements IMatriculavel{
  private String rga;
  private boolean matriculado;

  public Aluno(int idade, String cpf, String nome) {
    super(idade, cpf, nome);
    this.rga = null;
    this.matriculado = false;
  }

  public String getRga() {
    return rga;
  }

  public void setRga(String rga) {
    this.rga = rga;
  }

  public boolean isMatriculado() {
    return matriculado;
  }

  public void setMatriculado(boolean matriculado) {
    this.matriculado = matriculado;
  }

  @Override
  public String getIdentificacao () {
    return getCpf();
  }

  @Override
  public String toString() {
    return "Aluno: " + getNome() + ", RGA: " + rga + ", Idade: " + getIdade() + ", CPF: " + getCpf();
  }

  @Override
  public void matricular (String rga) {
    this.rga = rga;
    this.matriculado = true;
  }

  @Override
  public void cancelarMatricula() {
    this.matriculado = false;
    this.rga = null;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno aluno = (Aluno) obj;
    return rga.equals(aluno.rga);
  }

  @Override 
  public int hashCode() {
    return Objects.hash(rga);
  }
  
}
