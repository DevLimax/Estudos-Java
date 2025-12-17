package desafios_gpt;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverNomes {
    static void main() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(8);
        boolean sair = false;

        nomes.add("Natanael");
        nomes.add("Felipe");
        nomes.add("Cauan");
        nomes.add("Laercio");
        nomes.add("Luis");
        nomes.add("Isadora");
        nomes.add("Elisangela");
        nomes.add("Luisa");



        while (!sair) {
            System.out.print("Menu:\n(1) Remover Pessoa\n(2) Ver lista de pessoas\n(3) Sair\nEscolha: ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = input.next();

                    if (nomes.contains(nome)) {
                        nomes.remove(nome);
                    } else {
                        System.out.println("Nome não encontrado na lista.");
                    }
                    break;

                case 2:
                    System.out.println("==================");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println(nomes.get(i));
                    }
                    System.out.println("==================");
                    break;

                case 3:
                    sair = true;

                default:
                    System.out.println("Opção invalida!");

            }
        }

    }
}
