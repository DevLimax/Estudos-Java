package controle;

import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num_secreto = (int) (Math.random() * 1000);
        int chute;
        int tentativas = 0;

        do {
            System.out.println("Qual é o número secreto: ");
            chute = input.nextInt();

            if (chute > num_secreto) {
                System.out.println("Errou! o número é menor.");
                tentativas++;
            } else if (chute < num_secreto) {
                System.out.println("Errou! o número é maior.");
                tentativas++;
            }

        } while (chute != num_secreto);

        System.out.printf("Você acertou! o número era %d", num_secreto);
        System.out.printf("\nTentativas: %d", tentativas);
    }
}
