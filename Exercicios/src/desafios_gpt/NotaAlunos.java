package desafios_gpt;

import java.util.Scanner;

public class NotaAlunos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Aluno[] alunos = new Aluno[2];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do %d° aluno: ", i + 1);
            alunos[i] = new Aluno(input.nextLine());

            for (int n = 0; n < alunos[i].notas.length; n++) {
                System.out.printf("Digite a %d° nota do aluno %s: ", n + 1, alunos[i].nome);
                alunos[i].notas[n] = Double.parseDouble(input.nextLine().replace(",", "."));
            }
        }

        for (Aluno aluno: alunos) {
            System.out.println(aluno.calcularMedia());
        }
    }
}
