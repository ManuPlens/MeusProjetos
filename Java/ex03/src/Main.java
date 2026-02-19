public class Main {
    public static void main(String[] args) {
        
        // 1. Criando a primeira pessoa usando o PRIMEIRO construtor (Nome e Idade)
        Pessoa pessoa1 = new Pessoa("Carlos Silva", 28);
        
        // 2. Criando a segunda pessoa usando o SEGUNDO construtor (Idade, Nome e Endereço)
        // Nota: Estou usando a ordem exata que você definiu no seu código original
        Pessoa pessoa2 = new Pessoa(35, "Ana Souza", "Avenida Brasil, 1500");

        // 3. Exibindo os dados iniciais (isso vai chamar o seu método toString automaticamente)
        System.out.println("--- Dados Iniciais ---");
        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2: " + pessoa2);

        // 4. Usando os métodos SET para alterar os dados da pessoa1
        // Vamos simular que o Carlos fez aniversário
        pessoa1.setIdade(29); 
        
        // 5. Usando os métodos GET para pegar um dado específico da pessoa2
        System.out.println("\n--- Testando o GET ---");
        System.out.println("O nome da segunda pessoa é: " + pessoa2.getNome());

        // 6. Exibindo os dados atualizados
        System.out.println("\n--- Dados Atualizados ---");
        System.out.println("Pessoa 1: " + pessoa1);
    }
}