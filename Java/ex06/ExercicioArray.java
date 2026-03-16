package ex06;


import java.util.Scanner; 

public class ExercicioArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int[] numeros = new int[5];
        int soma = 0;
        int maior;
        int menor;

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição [" + i + "]: ");
            numeros[i] = scan.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
            soma += numeros[i];
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + (double) soma / numeros.length);
        
        scan.close(); 
    }
}