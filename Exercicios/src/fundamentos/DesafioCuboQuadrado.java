package fundamentos;

import java.util.Scanner;

public class DesafioCuboQuadrado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor;
        double valor_ao_quadrado;
        double valor_ao_cubo;

        System.out.println("Digite um valor: ");
        valor = input.nextDouble();
        input.close();

        valor_ao_quadrado = Math.pow(valor, 2);
        valor_ao_cubo = Math.pow(valor, 3);

        System.out.printf("Valor %.1f²: %.1f", valor, valor_ao_quadrado);
        System.out.printf("\nValor %.1f³: %.1f", valor, valor_ao_cubo);

    }
}
