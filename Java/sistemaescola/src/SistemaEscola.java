import java.util.Scanner;
import java.util.ArrayList;

public class SistemaEscola {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Aluno> alunosCadastrados = new ArrayList<>();
    private ArrayList<Turma> turmasCadastradas = new ArrayList<>();

    public void executar() {
        int opcao = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Criar Nova Turma");
            System.out.println("3. Inserir Aluno na Turma");
            System.out.println("4. Remover Aluno da Turma");
            System.out.println("5. Listar Alunos da Turma");
            System.out.println("6. Definir Idade de um Aluno");
            System.out.println("7. Remover Todos Alunos de uma Turma");
            System.out.println("8. Sair");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarTurma();
                    break;
                case 3:
                    inserirAlunoNaTurma();
                    break;
                case 4:
                    removerAlunoDaTurma();
                    break;
                case 5:
                    listarAlunosDaTurma();
                    break;
                case 6:
                    definirIdadeAluno();
                    break;
                case 7:
                    removerTodosAlunosTurma();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 8);
    }


    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do aluno:");
        String cpf = scanner.nextLine();
        alunosCadastrados.add(new Aluno(0, cpf, nome));
        System.out.println("Aluno cadastrado!");
    }

    public void cadastrarTurma() {
        System.out.println("Digite o nome da turma:");
        String nome = scanner.nextLine();
        System.out.println("Digite o código da turma:");
        String codigo = scanner.nextLine();
        turmasCadastradas.add(new Turma(nome, codigo));
        System.out.println("Turma cadastrada!");
    }

    public void inserirAlunoNaTurma() {
        System.out.println("Digite o código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) {
            System.out.println("Digite o CPF do aluno:");
            Aluno a = buscarAlunoPorCpf(scanner.nextLine());
            if (a != null) t.adicionarAluno(a);
            else System.out.println("Aluno não encontrado.");
        } else System.out.println("Turma não encontrada.");
    }

    public void removerAlunoDaTurma() {
        System.out.println("Digite o código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) {
            System.out.println("Digite o CPF do aluno a ser removido:");
            Aluno a = buscarAlunoPorCpf(scanner.nextLine());
            if (a != null) {
                t.getAlunos().remove(a);
                System.out.println("Aluno removido.");
            } else System.out.println("Aluno não encontrado.");
        } else System.out.println("Turma não encontrada.");
    }

    public void listarAlunosDaTurma() {
        System.out.println("Digite o código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) t.listarAlunos();
        else System.out.println("Turma não encontrada.");
    }

    public void definirIdadeAluno() {
        System.out.println("Digite o CPF do aluno a ser editado:");
        Aluno a = buscarAlunoPorCpf(scanner.nextLine());
        if (a != null) {
            System.out.println("Digite a idade do aluno: " + a.getNome());
            a.setIdade(scanner.nextInt());
            scanner.nextLine();
            System.out.println(a.toString());
        } else System.out.println("Aluno não encontrado.");
    }

    public void removerTodosAlunosTurma() {
        System.out.println("Digite o código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) {
            System.out.println("Você tem certeza que deseja remover todos? 1. Sim 2. Não");
            if (scanner.nextInt() == 1) {
                t.removerTodosAlunos();
                System.out.println("Turma limpa.");
            }
            scanner.nextLine();
        }
    }

    public Aluno buscarAlunoPorCpf(String cpf) {
        for (Aluno a : alunosCadastrados) {
            if (a.getCpf().equals(cpf)) return a;
        }
        return null;
    }

    public Turma buscarTurmaPorCodigo(String codigo) {
        for (Turma t : turmasCadastradas) {
            if (t.getCodigo().equals(codigo)) return t;
        }
        return null;
    }
}