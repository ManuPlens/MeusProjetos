#include <stdio.h>

enum DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA
};
int main() {
    enum DiaSemana diaAgendado;
    int escolha;
    
    printf("Escolha o dia da semana para sua consulta:\n");
    printf("1 - SEGUNDA\n");
    printf("2 - TERCA\n");
    printf("3 - QUARTA\n");
    printf("4 - QUINTA\n");
    printf("5 - SEXTA\n");
    printf("--------------------------------------------\n");
    printf("Digite o número correspondente ao dia: ");
    scanf("%d", &escolha);

    diaAgendado = escolha - 1;

    printf("\n");

    switch (diaAgendado) {
        case SEGUNDA:
            printf(" Consulta agendada para: SEGUNDA\n");
            break;
        case TERCA:
            printf(" Consulta agendada para: TERÇA\n");
            break;
        case QUARTA:
            printf(" Consulta agendada para: QUARTA\n");
            break;
        case QUINTA:
            printf(" Consulta agendada para: QUINTA\n");
            break;
        case SEXTA:
            printf(" Consulta agendada para: SEXTA\n");
            break;
        default:
            printf(" Dia inválido! O consultório funciona apenas de segunda a sexta-feira.\n");
            break;
    }

    return 0;
}