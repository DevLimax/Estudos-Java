package collections;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioCollectionsMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total_notas = 0;
        double media;

        System.out.print("Você possui quantos alunos na sala?: ");
        int qtd_alunos = input.nextInt();
        double[] notas = new double[qtd_alunos];

        for (int i = 0; i < notas.length; i++) {
            double nota;

            do {
                System.out.printf("Informe a nota do aluno %d: ", i+1);
                nota = Double.parseDouble(input.next().replace(",", "."));

                if (nota < 0 || nota > 10)
                { System.out.println("Nota invalida!");}
                else
                { notas[i] = nota; }

            } while (nota < 0 || nota > 10);
        }
        input.close();

        for (double nota: notas) {
            total_notas += nota;
        }

        media = total_notas / qtd_alunos;
        System.out.printf("A média das notas é: %.1f", media);
    }
}
