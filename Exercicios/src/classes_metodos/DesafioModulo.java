package classes_metodos;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pessoa p1 = new Pessoa("João pedro", 67.6);
        Pessoa p2 = new Pessoa("Ana larissa", 62.3);
        Boolean sair = false;

        System.out.println("Um casal está tendo um encontro no Restaurante!");
        System.out.printf("%s com %.1f Kg e %s com %.1fKg\n", p1.name, p1.peso, p2.name, p2.peso);
        System.out.println("Você está responsavel pelo registro das comidas que o casal comeu, registre o nome e a quantiadade em Kg.");

        while (!sair) {
            System.out.print("Menu:\n(1) Informar comida\n(2) Sair\nEscolha:");
            int escolha = input.nextInt();

            if (escolha == 1) {
                System.out.print("Nome da comida: ");
                String nome_comida = input.nextLine();
                input.nextLine();
                System.out.print("Peso da comida em Kg: ");
                double peso_comida = Double.parseDouble(input.next().replace(",", "."));

                Comida comida = new Comida(nome_comida, peso_comida);
                p1.comer(comida);
                p2.comer(comida);
            }
            else if (escolha == 2) {
                sair = true;
            }
            else {
                System.out.println("Escolha uma opção valida");
            }
        }

        input.close();
        System.out.println("================================");
        System.out.println("Peso do casal após o encontro:");
        System.out.printf("%s está com %.1fKg\n", p1.name, p1.peso);
        System.out.printf("%s está com %.1fKg", p2.name, p2.peso);
    }
}
