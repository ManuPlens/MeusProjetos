//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
#include <stdio.h>

int main() {
    int valor1; 
    int valor2; 
    
    printf("Digite o primeiro valor (1 para VERDADEIRO, 0 para FALSO): ");
    scanf("%d", &valor1);

    printf("Digite o segundo valor (1 para VERDADEIRO, 0 para FALSO): ");
    scanf("%d", &valor2);

    printf("\n--- Resultado da Checagem ---\n");

    
    if (valor1 == 1 && valor2 == 1) {
        printf("Ambos os valores sao **VERDADEIROS**.\n");
    } 
    
    else if (valor1 == 0 && valor2 == 0) {
        printf("Ambos os valores sao **FALSOS**.\n");
    } 
    
    else {
        printf("Os valores sao diferentes (um eh VERDADEIRO e o outro eh FALSO).\n");
    }

    return 0;
}

