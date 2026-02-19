public class Pessoa {
   private String nome;
   private int idade;
   private String endereco;
// método Get
   public String getNome(){
    return nome;
   }
   public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = "endereço default";
   }
   
   public Pessoa(int idade, String nome, String endereco) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
   }
// Método Set, o this é pq a origem é da Classe.
   public void setNome(String nome){
    this.nome = nome;
   }
   public int getIdade() {
    return idade;
   }
   public String getEndereco() {
    return endereco;
   }
   public void setIdade(int idade) {
    this.idade = idade;
   }
    @Override
public String toString() {
    return "nome=" + nome + ", idade=" + idade + ", endereco=" + endereco;

}

} 
