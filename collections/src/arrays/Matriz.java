package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtd_alunos;
        int qtd_notas;

        System.out.print("Informe a quantidade de alunos: ");
        qtd_alunos = input.nextInt();
        System.out.print("Informe a quantidade de notas: ");
        qtd_notas = input.nextInt();

        double[][] notasDaTurma = new double[qtd_alunos][qtd_notas];
        double[] mediasDaTurma = new double[qtd_alunos];

        for (int a = 0; a < qtd_alunos; a++) {
            double total = 0;
            for (int n = 0; n < qtd_notas; n++) {
                System.out.printf("Informe a %d° nota do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = Double.parseDouble(input.next().replace(",", "."));

                total += notasDaTurma[a][n];
            }

            mediasDaTurma[a] = total / qtd_notas;
        }

        for (int a = 0; a < qtd_alunos; a++) {
            System.out.println("===================");
            System.out.printf("A média do %d° aluno é: %.1f\n", a + 1, mediasDaTurma[a]);
        }

    }
}
