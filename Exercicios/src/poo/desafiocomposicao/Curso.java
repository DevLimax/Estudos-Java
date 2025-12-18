package poo.desafiocomposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    int id;
    String nome;
    final List<Modulo> modulos = new ArrayList<>();

    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id == curso.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}
