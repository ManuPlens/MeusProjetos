package ex09;

public class Main {
    public static void main(String[] args) {
        
        // 1. Testando a Conta Corrente (com limite de 1000)
        System.out.println("--- TESTE CONTA CORRENTE ---");
        ContaCorrente cc = new ContaCorrente("João Silva", 1234);
        cc.depositar(500); // Saldo: 500
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Saldo inicial: " + cc.getSaldo());
        
        // Testando o saque usando o limite (500 de saldo + 1000 de limite = 1500 total)
        cc.sacar(1200); 
        System.out.println("Saldo após saque de 1200: " + cc.getSaldo()); // Deve ficar -700
        
        System.out.println("\n----------------------------\n");

        // 2. Testando a Conta Poupança (sem limite, mas com rendimento)
        System.out.println("--- TESTE CONTA POUPANÇA ---");
        ContaPoupanca cp = new ContaPoupanca("Maria Oliveira", 5678);
        cp.depositar(2000); // Saldo: 2000
        
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Saldo antes do rendimento: " + cp.getSaldo());
        
        // Calculando e mostrando o rendimento
        double rendimento = cp.calcularRendimento();
        System.out.println("O rendimento calculado é: R$ " + rendimento);
        
        // Se você criou o método de aplicar (depositar o rendimento)
        cp.depositar(rendimento);
        System.out.println("Saldo após rendimento: " + cp.getSaldo());

       
        cp.sacar(3000); 
    }
}