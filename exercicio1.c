//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
int main() {

  int a, b, c, soma;

  printf("digite o valor de A:");
  scanf("%d", &a);
  printf("digite o valor de B:");
  scanf("%d", &b);
  printf("digite o valor de C:");
  scanf("%d", &c);
soma = a + b;

printf("soma de a + b: %d\n", soma);
printf("valor de c: %d\n", c);

if(soma < c) {
  printf("a soma de a + b eh menor que c");
  }  else {
    printf("a soma de a + b eh maior que c");
  }
return 0;
}