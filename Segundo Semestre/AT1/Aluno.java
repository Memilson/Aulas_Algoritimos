import java.util.*;

class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }
}

class Turma {
    private List<Aluno> listaDeAlunos;

    public Turma() {
        listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(new Aluno("Angelo", "4123412", 10.0));
        listaDeAlunos.add(new Aluno("Roberto", "1435616", 8.0));
        listaDeAlunos.add(new Aluno("Malvadeza", "4324132556", 5.0));
    }

    public void exibirAlunos() {
        System.out.println("Lista de alunos:");
        for (Aluno aluno : listaDeAlunos) {
            aluno.exibirInformacoes();
            System.out.println();
        }
    }

    public void exibirMaiorNota() {
        Aluno alunoMaiorNota = listaDeAlunos.get(0);

        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getNota() > alunoMaiorNota.getNota()) {
                alunoMaiorNota = aluno;
            }
        }

        System.out.println("Aluno com a maior nota:");
        alunoMaiorNota.exibirInformacoes();
    }

    public void mediaAluno() {
        int aluno1 = 1, aluno2 = 2, aluno3 = 3, aluno4 = 4, aluno5 = 5;
        Aluno media = listaDeAlunos.get((aluno1 + aluno2 + aluno3 + aluno4 + aluno5) / 5);
        double nota = aluno.getNota();


    }
}

// Classe com o método main
public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        turma.exibirAlunos();
        turma.exibirMaiorNota();
    }
}