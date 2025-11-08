//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
#include <stdio.h>

int main () {
  float valor;
 
  printf("me de um valor:\n");
  scanf("%f", &valor);

printf("O reajuste foi de: %.2f\n", valor * 1.05);

return 0;

}
