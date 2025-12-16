package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        String operador;

        System.out.print("Insira o primeiro número:");
        num1 = input.nextDouble();
        System.out.print("Insira o segundo número:");
        num2 = input.nextDouble();
        System.out.print("Escolha o operador do calculo. (Ex: +,-,*,/):");
        operador = input.next();
        input.close();

        double result = "+".equals(operador) ? num1 + num2 : 0;
        result = "-".equals(operador) ? num1 - num2 : result;
        result = "*".equals(operador) ? num1 * num2 : result;
        result = "/".equals(operador) ? num1 / num2 : result;

        System.out.printf("%.1f %s %.1f: %.1f",num1, operador, num2, result);
    }
}
