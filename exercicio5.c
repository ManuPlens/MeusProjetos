//Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.300,00).
#include <stdio.h>
#define SALARIO_MINIMO 1300.00

int main() {
 float salario_usuario;
 float quantidade_salario;
 
 printf("O valor do salario minimo eh: R$ %.2f\n", SALARIO_MINIMO);
 printf("Qual o seu salario: (R$)\n");
 scanf("%f", &salario_usuario);

 quantidade_salario = salario_usuario / SALARIO_MINIMO;

 printf("Salario do usuario: R$ %.2f\n", salario_usuario);
 printf("Voce recebe %.2f salarios minimos.\n", quantidade_salario);

 return 0;
}
