import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class SistemaEscola {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Aluno> alunosCadastrados = new ArrayList<>();
    private ArrayList<Turma> turmasCadastradas = new ArrayList<>();

    public void executar() throws FileNotFoundException {
        int opcao = 0;
        do {
            System.out.println("\n--- MENU ESCOLA ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Criar Nova Turma");
            System.out.println("3. Inserir Aluno na Turma");
            System.out.println("4. Remover Aluno da Turma");
            System.out.println("5. Listar Alunos da Turma");
            System.out.println("6. Definir Idade de um Aluno");
            System.out.println("7. Cadastrar turmas a partir de um arquivo");
            System.out.println("8. Cadastrar alunos a partir de um arquivo");
            System.out.println("9. Remover todos os alunos de uma turma");
            System.out.println("10. Sair");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: cadastrarAluno(); break;
                case 2: cadastrarTurma(); break;
                case 3: inserirAlunoNaTurma(); break;
                case 4: removerAlunoDaTurma(); break;
                case 5: listarAlunosDaTurma(); break;
                case 6: definirIdadeAluno(); break;
                case 7: cadastrarTurmasPorArquivo(); break;
                case 8: cadastrarAlunosPorArquivo(); break;
                case 9: removerTodosAlunosDeUmaTurma(); break;
                case 10: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!"); break;
            }
        } while (opcao != 10);
    }

    public void cadastrarTurmasPorArquivo() throws FileNotFoundException {
        System.out.println("Digite o nome do arquivo (ex: listaTurmas.csv):");
        String nomeArquivo = scanner.nextLine();
        File arquivo = new File(nomeArquivo);

        if (arquivo.exists()) {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(",");
                // dados[0] = Nome, dados[1] = Código
                Turma novaTurma = new Turma(dados[0], dados[1]);
                turmasCadastradas.add(novaTurma);
            }
            leitor.close();
            System.out.println("Turmas cadastradas com sucesso!");
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

    public void cadastrarAlunosPorArquivo() throws FileNotFoundException {
        System.out.println("Digite o nome do arquivo (ex: listaAlunosLOO.csv):");
        String nomeArquivo = scanner.nextLine();
        File arquivo = new File(nomeArquivo);

        if (arquivo.exists()) {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(",");
                
                Turma t = buscarTurmaPorCodigo(dados[2]);
                if (t != null) {
                    Aluno novo = new Aluno(0, dados[1], dados[0]);
                    t.adicionarAluno(novo);
                } else {
                    System.out.println("Turma " + dados[2] + " não encontrada para o aluno " + dados[0]);
                }
            }
            leitor.close();
            System.out.println("Processamento de alunos concluído!");
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

  

    public void removerTodosAlunosDeUmaTurma() {
        System.out.println("Código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) {
            System.out.println("Confirmar remoção total? 1-Sim 2-Não");
            if (scanner.nextInt() == 1) t.removerTodos();
            scanner.nextLine();
        }
    }

    public void cadastrarAluno() {
        System.out.println("Nome:"); String n = scanner.nextLine();
        System.out.println("CPF:"); String c = scanner.nextLine();
        alunosCadastrados.add(new Aluno(0, c, n));
    }

    public void cadastrarTurma() {
        System.out.println("Nome:"); String n = scanner.nextLine();
        System.out.println("Código:"); String c = scanner.nextLine();
        turmasCadastradas.add(new Turma(n, c));
    }

    public void inserirAlunoNaTurma() {
        System.out.println("Código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) {
            System.out.println("CPF do aluno:");
            Aluno a = buscarAlunoPorCpf(scanner.nextLine());
            if (a != null) t.adicionarAluno(a);
        }
    }

    public void removerAlunoDaTurma() {
        System.out.println("Código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) {
            System.out.println("CPF do aluno:");
            Aluno a = buscarAlunoPorCpf(scanner.nextLine());
            if (a != null) t.getAlunos().remove(a);
        }
    }

    public void listarAlunosDaTurma() {
        System.out.println("Código da turma:");
        Turma t = buscarTurmaPorCodigo(scanner.nextLine());
        if (t != null) t.listarAlunos();
    }

    public void definirIdadeAluno() {
        System.out.println("CPF do aluno:");
        Aluno a = buscarAlunoPorCpf(scanner.nextLine());
        if (a != null) {
            System.out.println("Idade para " + a.getNome() + ":");
            a.setIdade(scanner.nextInt());
            scanner.nextLine();
            System.out.println(a.toString());
        }
    }

    public Aluno buscarAlunoPorCpf(String cpf) {
        for (Aluno a : alunosCadastrados) { if (a.getCpf().equals(cpf)) return a; }
        return null;
    }

    public Turma buscarTurmaPorCodigo(String codigo) {
        for (Turma t : turmasCadastradas) { if (t.getCodigo().equals(codigo)) return t; }
        return null;
    }
}