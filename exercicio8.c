//Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
#include <stdio.h>

int main () {
  int a, b, c;

printf("me de o primeiro valor:");
scanf("%d", &a);

printf("me de o segundo valor:");
scanf("%d", &b);

printf("me de o terceiro valor:");
scanf("%d", &c);

if (a == b || b == c || a == c ) {
  printf("Para esse codigo funcionar, os valores tem que ser diferentes!!");

  return 1;
}

printf("Os valores em ordem decrescente sao:\n");
if (a > b && a > c) {
        if (b > c) {
            printf("%d, %d, %d\n", a, b, c);
        } else {
            printf("%d, %d, %d\n", a, c, b);
        }
    }
    else if (b > a && b > c) {
        if (a > c) {
            printf("%d, %d, %d\n", b, a, c);
        } else {
            printf("%d, %d, %d\n", b, c, a);
        }
    }
    else {
        if (a > b) {
            printf("%d, %d, %d\n", c, a, b);
        } else {
            printf("%d, %d, %d\n", c, b, a);
        }
    }

    return 0;

  }
