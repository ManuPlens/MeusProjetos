package ex05;

public class Aluno {
  private String nome;
  private int idade;
  private String ra;

  public Aluno(String nome, int idade, String ra) {
    this.nome = nome;
    this.idade = idade;
    this.ra = ra;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getRa() {
    return ra;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }

  public void printStatus() {
    System.out.println("Nome  = " + nome);
    System.out.println("Idade = " + idade);
    System.out.println("RA    = " + ra);
  }

 
  @Override
  public String toString() {
    return "Aluno [Nome: " + nome + ", Idade: " + idade + ", RA: " + ra + "]";
  }
}