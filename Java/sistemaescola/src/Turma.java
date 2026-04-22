import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;
    private String nome;
    private String codigo;

    public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        int anoAtual = java.time.Year.now().getValue();
        String novoRga = codigo + "/" + anoAtual + "/" + aluno.getCpf();
        aluno.matricular(novoRga);
        alunos.add(aluno);
    }

    public void removerTodosAlunos() {
        alunos.clear();
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Turma vazia.");
        } else {
            for (int i = 0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                System.out.println("Posição: " + i + " - " + aluno.getNome() + " - " + aluno.getRga());
            }
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
}