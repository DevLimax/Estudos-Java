package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static String capitalize(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String valor;

        System.out.print("Escreva o dia da semana: ");
        valor = input.nextLine().toLowerCase();

        if (valor.equals("domingo")) {
            System.out.printf("%s é o 1° dia da semana!", capitalize(valor));
        }
        else if (valor.equals("segunda")) {
            System.out.printf("%s é o 2° dia da semana!", capitalize(valor));
        }
        else if (valor.equals("terça") || valor.equals("terca")) {
            System.out.println("Terça é o 3° dia da semana!");
        }
        else if (valor.equals("quarta")) {
            System.out.printf("%s é o 4° dia da semana!", capitalize(valor));
        }
        else if (valor.equals("quinta")) {
            System.out.printf("%s é o 5° dia da semana!", capitalize(valor));
        }
        else if (valor.equals("sexta")) {
            System.out.printf("%s é o 6° dia da semana!", capitalize(valor));
        }
        else if (valor.equals("sabado")) {
            System.out.printf("%s é o 7° dia da semana!", capitalize(valor));
        }
    }
}
