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

