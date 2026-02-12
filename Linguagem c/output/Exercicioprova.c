#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define QTD_QUESTOES 10
#define MAX_ALUNOS 3

typedef struct
{
    int id;
    char respostas[QTD_QUESTOES];
    int acertos;
} Aluno;

// Declaração das funções
void exibirMenu();
void menuGabarito();
void cadastrarGabarito();
void carregarGabarito();
void cadastrarAluno();
void corrigirProvas();
void exibirResultados();

// Variáveis Globais
char gabarito[QTD_QUESTOES];
Aluno alunos[MAX_ALUNOS];
int qtdAlunos = 0;

int main()
{
    exibirMenu();
    return 0;
}

void exibirMenu()
{
    int opcao = 0;

    while (opcao != 5)
    {
        printf("\n===== MENU =====\n");
        printf("1 - Menu Gabarito\n");
        printf("2 - Cadastrar Aluno\n");
        printf("3 - Corrigir Provas\n");
        printf("4 - Exibir Resultados\n");
        printf("5 - Sair\n");
        printf("================\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao)
        {
        case 1:
            menuGabarito();
            break;
        case 2:
            if (qtdAlunos < MAX_ALUNOS)
            {
                cadastrarAluno();
            }
            else
            {
                printf("Limite máximo de alunos atingido!\n");
            }
            break;
        case 3:
            corrigirProvas();
            break;
        case 4:
            exibirResultados();
            break;
        case 5:
            printf("Encerrando o programa...\n");
            break;
        default:
            printf("Opcao invalida!\n");
            break;
        }
    }
}

void menuGabarito()
{
    int qual = 0;
    while (qual != 9)
    {
        printf("\n===== MENU [GABARITO] =====\n");
        printf("1 - Cadastrar Gabarito Oficial\n");
        printf("2 - Usar Gabarito pré-carregado\n");
        printf("9 - Voltar\n");
        printf("Escolha uma opção: ");
        scanf("%d", &qual);
        switch (qual)
        {
        case 1:
            cadastrarGabarito();
            break;
        case 2:
            carregarGabarito();
            break;
        case 9:
            printf("Voltando ao menu principal...\n");
            break;
        default:
            printf("Opcao invalida!\n");
            break;
        }
    }
}

void cadastrarGabarito()
{
    char alternativa;
    printf("\nDigite o gabarito oficial (%d questoes):\n", QTD_QUESTOES);
    int i = 0;
    while (i < QTD_QUESTOES)
    {
        printf("Questão %d: ", i + 1);
        scanf(" %c", &alternativa);
        alternativa = toupper(alternativa);
        switch (alternativa)
        {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
            gabarito[i] = alternativa;
            i++;
            break;
        default:
            printf("Opcao invalida!\n");
            break;
        }
    }
    if (i >= 9)
    {
        printf("Gabarito cadastrado com sucesso!\n");
    }
    else
    {
        printf("Ocorreu um erro ao cadastrar o Gabarito!\n");
    }
}

void carregarGabarito()
{
    printf("Carregando Gabarito pré-cadastrado!\n");
    gabarito[0] = 'A';
    gabarito[1] = 'B';
    gabarito[2] = 'C';
    gabarito[3] = 'D';
    gabarito[4] = 'E';
    gabarito[5] = 'A';
    gabarito[6] = 'B';
    gabarito[7] = 'C';
    gabarito[8] = 'D';
    gabarito[9] = 'E';
    printf("Gabarito cadastrado com sucesso!\n");
}

void cadastrarAluno()
{
    int id = 0;
    char alternativa;
    Aluno a;
    printf("\nInforme o ID do aluno: ");
    scanf("%d", &id);
    a.id = id;
    printf("Digite as respostas do aluno (%d questoes):\n", QTD_QUESTOES);
    for (int i = 0; i < QTD_QUESTOES; i++)
    {
        printf("Questao %d: ", i + 1);
        scanf(" %c", &alternativa);
        a.respostas[i] = toupper(alternativa);
    }
    a.acertos = 0; // inicializa acertos
    alunos[qtdAlunos] = a;
    qtdAlunos++;
}

void corrigirProvas()
{
    for (int i = 0; i < qtdAlunos; i++)
    {
        int contador = 0;
        for (int j = 0; j < QTD_QUESTOES; j++)
        {
            if (alunos[i].respostas[j] == gabarito[j])
            {
                contador++;
            }
        }
        alunos[i].acertos = contador;
    }
    printf("\nProvas corrigidas com sucesso!\n");
}

void exibirResultados()
{
    printf("\n===== RESULTADOS =====\n");
    for (int i = 0; i < qtdAlunos; i++)
    {
        printf("Aluno %d: %d acertos\n", alunos[i].id, alunos[i].acertos);
    }
    printf("=======================\n");
}