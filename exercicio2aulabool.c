#include <stdio.h>
#include <stdbool.h>

int main() {
    int idade;
    bool cinto_obrigatorio = false;

    printf("digite sua idade:");
    scanf("%d", idade);

    printf("Cinto obrigatorio? (1 para sim, 0 para n)");
    scanf("%hhd", &cinto_obrigatorio);

    bool pode_dirigir = ((idade >= 18) && (cinto_obrigatorio));
    
    if(pode_dirigir){
      printf("voce pode dirigir com cinto de seguranca\n");
    } else {
      printf("voce nao pode dirigir com cinto de seguranca\n");
    }
    return 0;
  }
    
    

    