package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu 1° Salario: ");
        String str_salario1 = input.next().replace(",", ".");

        System.out.print("Informe o seu 2° Salario: ");
        String str_salario2 = input.next().replace(",", ".");

        System.out.print("Informe o seu 1° Salario: ");
        String str_salario3 = input.next().replace(",", ".");

        // Conversão dos Salarios para variaveis do tipo número: double

        double salario1 = Double.parseDouble(str_salario1);
        double salario2 = Double.parseDouble(str_salario2);
        double salario3 = Double.parseDouble(str_salario3);

        double soma = salario1 + salario2 + salario3;

        double media = soma / 3;

        System.out.println("A soma dos salarios é igual a: " + soma);
        System.out.printf("A media dos salarios é: %.3f", media);

    }
}
