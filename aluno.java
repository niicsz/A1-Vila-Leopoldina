import java.util.Scanner;

public class Aluno {
    private String nome;
    private String turma;
    private double notaFinal;

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public void calcularNotaFinal(int numAvaliacoes) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 0; i < numAvaliacoes; i++) {
            System.out.println("Digite a nota da avaliação " + (i + 1) + ": ");
            somaNotas += scanner.nextDouble();
        }

        this.notaFinal = somaNotas / numAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "Turma A");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de avaliações que o aluno realizou: ");
        int numAvaliacoes = scanner.nextInt();

        aluno.calcularNotaFinal(numAvaliacoes);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Nota Final: " + aluno.getNotaFinal());
    }
}
