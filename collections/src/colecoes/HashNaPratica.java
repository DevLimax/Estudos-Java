package colecoes;

import java.util.HashSet;
import java.util.Set;

public class HashNaPratica {
    public static void main(String[] args) {

        Set<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario(1, "Jean carlos"));
        usuarios.add(new Usuario(2, "Lucas minus"));
        usuarios.add(new Usuario(3, "Carlos"));
        usuarios.add(new Usuario(4, "Natan noronha"));
        usuarios.add(new Usuario(5, "João pedro"));
        usuarios.add(new Usuario(6, "Ryan guilherme"));

        boolean encontrado = usuarios.contains(new Usuario(3));
        System.out.println(encontrado);
    }
}
