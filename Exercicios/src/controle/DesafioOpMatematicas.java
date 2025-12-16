package controle;

import java.util.Scanner;

public class DesafioOpMatematicas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 0;
        double num1;
        double num2;
        double result;

        while (opcao != 5) {
            System.out.println("-----------------------------");
            System.out.println("(1) Somar\n(2) Subtrair\n(3) Multiplicar\n(4) Dividir\n(5) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao != 5) {

                boolean opcao_valida = opcao >= 0 && opcao <= 5;
                if (!opcao_valida) {
                    System.out.println("Escolha uma opção valida!");
                    continue;
                }

                System.out.print("Informe o 1° número: ");
                num1 = input.nextDouble();
                System.out.print("Informe o 2° número: ");
                num2 = input.nextDouble();

                switch (opcao) {
                    case 4:
                        result = num1 / num2;
                        System.out.printf("Resultado -> %.1f / %.1f = %.1f\n", num1, num2, result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.printf("Resultado -> %.1f x %.1f = %.1f\n", num1, num2, result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.printf("Resultado -> %.1f - %.1f = %.1f\n", num1, num2, result);
                        break;
                    case 1:
                        result = num1 + num2;
                        System.out.printf("Resultado -> %.1f + %.1f = %.1f\n", num1, num2, result);
                }
            }
        }
        System.out.println("Sistema encerrado!");
    }
}
