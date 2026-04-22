public abstract class PessoaFisica {
  private int idade;
  private String cpf;
  private String nome;

  public PessoaFisica(int idade, String cpf, String nome) {
    this.idade = idade;
    this.cpf = cpf;
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
public int calcularAnoNascimento() {
  int anoAtual = java.time.Year.now().getValue();
  return anoAtual - idade;
}

public abstract String getIdentificacao();

@Override
public String toString() {
  return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
}  
}
