package desafios_gpt;

import java.util.Scanner;

public class NotaAlunos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        double notaTotalTurma = 0;
        double mediaTurma;
        int alunosAcimaDaMedia = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do %d° aluno: ", i + 1);
            alunos[i] = new Aluno(input.nextLine());

            for (int n = 0; n < alunos[i].notas.length; n++) {
                System.out.printf("Digite a %d° nota do aluno %s: ", n + 1, alunos[i].nome);

                alunos[i].notas[n] = Double.parseDouble(input.nextLine().replace(",", "."));
            }
        }

        for (Aluno aluno: alunos) {

            if (aluno.calcularMedia() >= 7) {
                alunosAcimaDaMedia++;
            }
            notaTotalTurma += aluno.calcularMedia();
        }

        mediaTurma = notaTotalTurma / alunos.length;

        for (Aluno aluno: alunos) {
            System.out.printf("%s - Média: %.1f\n", aluno.nome, aluno.calcularMedia());
        }
        System.out.printf("Média da turma: %.1f\n", mediaTurma);
        System.out.println("Alunos acima da média: " + alunosAcimaDaMedia);
    }
}
