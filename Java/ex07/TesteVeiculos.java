package ex07;

public class TesteVeiculos {
    public static void main(String[] args) {
        System.out.println("--- Testando Carro ---");
        Carro carro1 = new Carro("Toyota", 2024, 4);
        System.out.println(carro1.exibirInfo());

        System.out.println("\n--- Testando Moto ---");
        Moto moto1 = new Moto("Honda", 2023, 600);
        System.out.println(moto1.exibirInfo()   );
    }
}