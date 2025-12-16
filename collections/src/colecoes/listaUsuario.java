package colecoes;

import java.util.ArrayList;
import java.util.List;

public class listaUsuario {
    public static void main(String[] args) {

        List<Usuario> listaUsuario = new ArrayList<>();

        listaUsuario.add(new Usuario(1, "João pedro"));
        listaUsuario.add(new Usuario(2, "Marcelo milos"));
        listaUsuario.add(new Usuario(3, "Joseph Queen"));
        listaUsuario.add(new Usuario(4, "Leandro"));
        listaUsuario.add(new Usuario(5, "Mariana Aveiro"));
        listaUsuario.add(new Usuario(6, "Jully bubs"));

        System.out.println(listaUsuario.get(4));
        System.out.println("Removido: " + listaUsuario.remove(1)); //Removendo um objeto pelo indice (obs: indice começa do 0)
        System.out.println("Removido: " + listaUsuario.remove(new Usuario(6, "Bla bla bla"))); //Removendo pela igualdade do objeto
        System.out.println("Tem? "+ listaUsuario.contains(new Usuario(8)));

        for (Usuario user: listaUsuario) {
            System.out.println(user);
        } // usando o FOR na lista
        System.out.println(listaUsuario.size());

    }
}
