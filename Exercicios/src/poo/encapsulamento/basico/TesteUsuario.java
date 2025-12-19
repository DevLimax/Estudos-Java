package poo.encapsulamento.basico;

import java.util.Scanner;

public class TesteUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Usuario user = new Usuario();

        System.out.print("Informe o seu primeiro nome: ");
        user.setPrimeiro_nome(input.nextLine());
        System.out.print("Informe o seu sobrenome: ");
        user.setSegundo_nome(input.nextLine());
        System.out.print("Informe o seu email: ");
        user.setEmail(input.nextLine());

        System.out.println(user.getID());
        System.out.println(user.getPrimeiro_nome());
        System.out.println(user.getSegundo_nome());
        System.out.println(user.getEmail());
    }
}
