//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
#include <stdio.h>

int main () {
  int valor1, valor2, c;

  printf("Qual o primeiro valor:");
  scanf("%d", &valor1);
  printf("Qual o segundo valor:");
  scanf("%d", &valor2);

  if (valor1 == valor2) {
    c = valor1 + valor2;
    printf("os valores de a e b sao iguais\n");
  } else {
    c = valor1 * valor2;
    printf("os valores de a e b sao diferentes\n");
  }
  printf("O valor de C: %d\n", c);

  return 0;
}