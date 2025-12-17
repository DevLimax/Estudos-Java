package classes_metodos;

import java.util.Scanner;

public class DesafioDataTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite um número para o mês: ");
        int mes = input.nextInt();
        System.out.print("Digite um número para o ano: ");
        int ano = input.nextInt();

        Data data = new Data(dia, mes, ano);

        System.out.printf("A data que você formou: %s", data.toString());

    }
}
