package fundamentos;

import java.util.Scanner;

public class DesafioAreaTriang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a base do triangulo em cm²: ");
        double base = input.nextDouble();
        System.out.print("Informe a altura do triangulo em cm²: ");
        double altura = input.nextDouble();

        double area_triangulo = (base * altura) / 2;

        System.out.printf("A aréa de um triangulo com %.1fcm de base e %.1fcm de altura é %.1fcm²", base, altura, area_triangulo);

    }
}
