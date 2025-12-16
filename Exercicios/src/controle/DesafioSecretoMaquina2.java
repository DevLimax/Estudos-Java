package controle;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class DesafioSecretoMaquina2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num_secreto; // número de 1 a 500
        int chute = -1;
        int tentativas = 0;
        int valor_min = 0;
        int valor_max = 1000;

        System.out.printf("Escolha o número secreto (de %d - %d): ", valor_min, valor_max - 1);
        num_secreto = input.nextInt();

        while (chute != num_secreto && tentativas < 500) {
            chute = (valor_max - valor_min) / 2 + valor_min;
            tentativas++;

            if (num_secreto > chute) {
                valor_min = chute;
            } else if (num_secreto < chute){
                valor_max = chute;
            }
        }

        if (chute == num_secreto) {
            System.out.printf("A maquina acertou o número secreto: %d\nTentativas: %d", chute, tentativas);
        } else {
            System.out.printf("A maquina fez %d tentativas e não conseguiu encontrar o número secreto.", tentativas);
        }

    }
}
