package fundamentos;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = input.nextInt();
        System.out.println("Digite um segundo número:");
        int n2 = input.nextInt();
        System.out.println(("Digite um terceiro número:"));
        int n3 = input.nextInt();

        int maior_numero = Math.max(n1, Math.max(n2, n3));

        System.out.printf("O maior número que você digitou é o número %d", maior_numero);
    }
}
