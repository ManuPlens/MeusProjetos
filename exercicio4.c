//Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
#include <stdio.h>

int main() {
  int numero;

  printf("Digite um numero:");
  scanf("%d", &numero);

  printf("O sucessor do seu numero eh: %d\n", numero + 1);
  printf("O antecessor do seu numero eh: %d\n", numero - 1);

  return 0;
}
