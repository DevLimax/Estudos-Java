package fundamentos;

import java.util.Scanner;

public class ParOrImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int number = input.nextInt();
        int resto_divisao = number % 2;

        if (resto_divisao == 0) {
            System.out.printf("O número %d é um número par!!", number);
        } else {
            System.out.printf("O número %d é um número impar!!", number);
        }

    }
}
