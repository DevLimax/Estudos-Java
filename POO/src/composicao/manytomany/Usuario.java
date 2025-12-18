package composicao.manytomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    int id;
    String nome;
    String emil;
    final List<Perfil> perfis = new ArrayList<>();

    public Usuario(int id, String nome, String emil) {
        this.id = id;
        this.nome = nome;
        this.emil = emil;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", emil='" + emil + '\'' +
                ", perfis=" + perfis +
                '}';
    }
}
