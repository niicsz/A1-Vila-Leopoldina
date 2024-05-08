import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nicolas Bezerra Bini", "Ads - USJT - Vl. Leopoldina");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de avaliações que o aluno realizou: ");
        int numAvaliacoes = scanner.nextInt();

        aluno.calcularNotaFinal(numAvaliacoes);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Nota Final: " + aluno.getNotaFinal());
    }
}