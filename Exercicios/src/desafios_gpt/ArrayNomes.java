package desafios_gpt;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNomes {
    static void main() {

        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o nome da %d° pessoa: ", i + 1);
            String nome = input.nextLine();
            nomes.add(nome);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
