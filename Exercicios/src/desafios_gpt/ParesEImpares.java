package desafios_gpt;

import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int qtd_pares = 0;
        int qtd_impares = 0;

        for (int i = 0; i < 10; i++) {

            System.out.printf("Insira o %d° número: ", i + 1);
            int num = input.nextInt();

            if (num % 2 == 0) {
                qtd_pares += 1;
            } else {
                qtd_impares += 1;
            }
        }

        System.out.printf("Você digitou %d números parés e %d números ímpares.", qtd_pares, qtd_impares);
    }
}
