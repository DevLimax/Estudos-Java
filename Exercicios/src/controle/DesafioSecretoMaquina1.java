package controle;

import java.util.Scanner;

public class DesafioSecretoMaquina1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num_secreto; // número de 1 a 500
        int chute;
        int tentativas = 0;

        System.out.print("Escolha o número secreto: ");
        num_secreto = input.nextInt();

        do {
            chute = (int) (Math.random() * 500);
            if (chute != num_secreto) {
                tentativas++;
            }
        } while (chute != num_secreto && tentativas < 1_000);

        if (chute == num_secreto) {
            System.out.printf("A maquina acertou o número secreto é: %d\nTentativas: %d", num_secreto, tentativas);
        } else {
            System.out.printf("A maquina tentou %d de vezes e não conseguiu adivinhar o número.", tentativas);
        }


    }
}
