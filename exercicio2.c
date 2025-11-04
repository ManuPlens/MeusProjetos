//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
#include <stdio.h>

int main() {
int n;
printf("digite um numero:\n");
scanf("%d", &n);

if(n > 0) {
  printf("numero eh positivo e", n);
} else if (n < 0) {
  printf("numero eh negativo e", n);
} else {
  printf("numero eh zero\n", n);
 return 0;
}

if (n %2 == 0) {
  printf(" o numero eh par\n");
} else {
  printf(" o numero eh impar\n");
}
return 0 ;
}