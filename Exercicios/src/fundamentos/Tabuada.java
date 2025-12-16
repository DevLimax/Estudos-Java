package fundamentos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número no console:");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int valor_multiplicado = numero * i;
            System.out.printf("%d x %d = %d", numero, i, valor_multiplicado);
            System.out.println();
        }
    }
}
